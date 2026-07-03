package clicker_Generator.presentation;

import clicker_Generator.achievement;
import clicker_Generator.binaryExpression;
import clicker_Generator.comparison;
import clicker_Generator.comparisonOperator;
import clicker_Generator.effect;
import clicker_Generator.expression;
import clicker_Generator.game;
import clicker_Generator.generator;
import clicker_Generator.logicOperator;
import clicker_Generator.multiplyRateEffect;
import clicker_Generator.reduceCostEffect;
import clicker_Generator.resource;
import clicker_Generator.unlockGeneratorEffect;
import clicker_Generator.upgrade;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class ClickerHtmlGenerator {
  public String generate(final game game) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>");
    String _name = game.getName();
    _builder.append(_name, "    ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<style>");
    String _generateCss = this.generateCss();
    _builder.append(_generateCss, "    ");
    _builder.append("</style>");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<h1>");
    String _name_1 = game.getName();
    _builder.append(_name_1, "    ");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div id=\"resources\">");
    _builder.newLine();
    {
      EList<resource> _resources = game.getResources();
      for(final resource r : _resources) {
        _builder.append("        ");
        _builder.append("<div class=\"resource\">");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        String _name_2 = r.getName();
        _builder.append(_name_2, "            ");
        _builder.append(": <span id=\"res_");
        String _name_3 = r.getName();
        _builder.append(_name_3, "            ");
        _builder.append("\">");
        double _startAmount = r.getStartAmount();
        _builder.append(_startAmount, "            ");
        _builder.append("</span>");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div id=\"generators\">");
    _builder.newLine();
    {
      EList<generator> _generators = game.getGenerators();
      for(final generator g : _generators) {
        _builder.append("    ");
        _builder.append("<button id=\"btn_");
        String _name_4 = g.getName();
        _builder.append(_name_4, "    ");
        _builder.append("\" onclick=\"buy");
        String _name_5 = g.getName();
        _builder.append(_name_5, "    ");
        _builder.append("()\">");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("Buy ");
        String _name_6 = g.getName();
        _builder.append(_name_6, "        ");
        _builder.append(" — Cost: <span id=\"cost_");
        String _name_7 = g.getName();
        _builder.append(_name_7, "        ");
        _builder.append("\">");
        double _baseCost = g.getBaseCost();
        _builder.append(_baseCost, "        ");
        _builder.append("</span>");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("</button>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div id=\"upgrades\">");
    _builder.newLine();
    {
      EList<upgrade> _upgrades = game.getUpgrades();
      for(final upgrade u : _upgrades) {
        _builder.append("    ");
        _builder.append("<button id=\"upg_");
        String _safeName = this.safeName(u);
        _builder.append(_safeName, "    ");
        _builder.append("\" onclick=\"buyUpgrade_");
        String _safeName_1 = this.safeName(u);
        _builder.append(_safeName_1, "    ");
        _builder.append("()\">");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        String _name_8 = u.getName();
        _builder.append(_name_8, "        ");
        _builder.append(" — Cost: ");
        double _cost = u.getCost();
        _builder.append(_cost, "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("</button>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div id=\"achievements\"></div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script>");
    String _generateJs = this.generateJs(game);
    _builder.append(_generateJs, "    ");
    _builder.append("</script>");
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateCss() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("body { font-family: sans-serif; padding: 2em; }");
    _builder.newLine();
    _builder.append("button { display: block; margin: 0.5em 0; padding: 0.5em 1em; }");
    _builder.newLine();
    _builder.append("button:disabled { opacity: 0.4; }");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateJs(final game game) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("let state = {");
    _builder.newLine();
    {
      EList<resource> _resources = game.getResources();
      boolean _hasElements = false;
      for(final resource r : _resources) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        String _name = r.getName();
        _builder.append(_name, "    ");
        _builder.append(": ");
        double _startAmount = r.getStartAmount();
        _builder.append(_startAmount, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    {
      EList<generator> _generators = game.getGenerators();
      for(final generator g : _generators) {
        _builder.append("let count_");
        String _name_1 = g.getName();
        _builder.append(_name_1);
        _builder.append(" = 0;");
        _builder.newLineIfNotEmpty();
        _builder.append("let cost_");
        String _name_2 = g.getName();
        _builder.append(_name_2);
        _builder.append(" = ");
        double _baseCost = g.getBaseCost();
        _builder.append(_baseCost);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("function buy");
        String _name_3 = g.getName();
        _builder.append(_name_3, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        _builder.append("if (state.");
        String _name_4 = g.getProduces().getName();
        _builder.append(_name_4, "\t    ");
        _builder.append(" >= cost_");
        String _name_5 = g.getName();
        _builder.append(_name_5, "\t    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("state.");
        String _name_6 = g.getProduces().getName();
        _builder.append(_name_6, "\t        ");
        _builder.append(" -= cost_");
        String _name_7 = g.getName();
        _builder.append(_name_7, "\t        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("count_");
        String _name_8 = g.getName();
        _builder.append(_name_8, "\t        ");
        _builder.append("++;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("cost_");
        String _name_9 = g.getName();
        _builder.append(_name_9, "\t        ");
        _builder.append(" *= ");
        double _costGrowth = g.getCostGrowth();
        _builder.append(_costGrowth, "\t        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("document.getElementById(\'cost_");
        String _name_10 = g.getName();
        _builder.append(_name_10, "\t        ");
        _builder.append("\').innerText = cost_");
        String _name_11 = g.getName();
        _builder.append(_name_11, "\t        ");
        _builder.append(".toFixed(1);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<upgrade> _upgrades = game.getUpgrades();
      for(final upgrade u : _upgrades) {
        _builder.append("let bought_");
        String _safeName = this.safeName(u);
        _builder.append(_safeName);
        _builder.append(" = false;");
        _builder.newLineIfNotEmpty();
        _builder.append("function buyUpgrade_");
        String _safeName_1 = this.safeName(u);
        _builder.append(_safeName_1);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (!bought_");
        String _safeName_2 = this.safeName(u);
        _builder.append(_safeName_2, "    ");
        _builder.append(" && state.Cookies >= ");
        double _cost = u.getCost();
        _builder.append(_cost, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          EList<resource> _resources_1 = game.getResources();
          for(final resource r_1 : _resources_1) {
            _builder.append("        ");
            _builder.append("state.");
            String _name_12 = r_1.getName();
            _builder.append(_name_12, "        ");
            _builder.append(" -= ");
            double _cost_1 = u.getCost();
            _builder.append(_cost_1, "        ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("        ");
        _builder.append("bought_");
        String _safeName_3 = this.safeName(u);
        _builder.append(_safeName_3, "        ");
        _builder.append(" = true;");
        _builder.newLineIfNotEmpty();
        {
          EList<effect> _effects = u.getEffects();
          for(final effect e : _effects) {
            _builder.append("        ");
            String _generateEffect = this.generateEffect(e);
            _builder.append(_generateEffect, "        ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("        ");
        _builder.append("document.getElementById(\'upg_");
        String _safeName_4 = this.safeName(u);
        _builder.append(_safeName_4, "        ");
        _builder.append("\').disabled = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<achievement> _achievements = game.getAchievements();
      for(final achievement a : _achievements) {
        _builder.append("function checkAchievement_");
        String _safeName_5 = this.safeName(a);
        _builder.append(_safeName_5);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (!unlocked_");
        String _safeName_6 = this.safeName(a);
        _builder.append(_safeName_6, "    ");
        _builder.append(" && (");
        String _generateExpression = this.generateExpression(a.getCondition());
        _builder.append(_generateExpression, "    ");
        _builder.append(")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("unlocked_");
        String _safeName_7 = this.safeName(a);
        _builder.append(_safeName_7, "        ");
        _builder.append(" = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("alert(\"Achievement unlocked: ");
        String _name_13 = a.getName();
        _builder.append(_name_13, "        ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.append("let unlocked_");
        String _safeName_8 = this.safeName(a);
        _builder.append(_safeName_8);
        _builder.append(" = false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("setInterval(() => {");
    _builder.newLine();
    {
      EList<generator> _generators_1 = game.getGenerators();
      for(final generator g_1 : _generators_1) {
        _builder.append("    ");
        _builder.append("state.");
        String _name_14 = g_1.getProduces().getName();
        _builder.append(_name_14, "    ");
        _builder.append(" += count_");
        String _name_15 = g_1.getName();
        _builder.append(_name_15, "    ");
        _builder.append(" * ");
        double _baseRate = g_1.getBaseRate();
        _builder.append(_baseRate, "    ");
        _builder.append(" * 0.1;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<resource> _resources_2 = game.getResources();
      for(final resource r_2 : _resources_2) {
        _builder.append("    ");
        _builder.append("document.getElementById(\'res_");
        String _name_16 = r_2.getName();
        _builder.append(_name_16, "    ");
        _builder.append("\').innerText = state.");
        String _name_17 = r_2.getName();
        _builder.append(_name_17, "    ");
        _builder.append(".toFixed(1);");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<achievement> _achievements_1 = game.getAchievements();
      for(final achievement a_1 : _achievements_1) {
        _builder.append("    ");
        _builder.append("checkAchievement_");
        String _safeName_9 = this.safeName(a_1);
        _builder.append(_safeName_9, "    ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}, 100);");
    _builder.newLine();
    return _builder.toString();
  }

  protected String _generateEffect(final multiplyRateEffect e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Rate von ");
    String _name = e.getTarget().getName();
    _builder.append(_name);
    _builder.append(" verdoppeln etc.");
    _builder.newLineIfNotEmpty();
    _builder.append("globalMultiplier_");
    String _name_1 = e.getTarget().getName();
    _builder.append(_name_1);
    _builder.append(" = (");
    double _factor = e.getFactor();
    _builder.append(_factor);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected String _generateEffect(final reduceCostEffect e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cost_");
    String _name = e.getTarget().getName();
    _builder.append(_name);
    _builder.append(" *= ");
    double _factor = e.getFactor();
    _builder.append(_factor);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected String _generateEffect(final unlockGeneratorEffect e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("document.getElementById(\'btn_");
    String _name = e.getTarget().getName();
    _builder.append(_name);
    _builder.append("\').style.display = \'block\';");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected String _generateExpression(final comparison c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("state.");
    String _name = c.getResource().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _jsOperator = this.toJsOperator(c.getOperator());
    _builder.append(_jsOperator);
    _builder.append(" ");
    double _value = c.getValue();
    _builder.append(_value);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected String _generateExpression(final binaryExpression b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _generateExpression = this.generateExpression(b.getLeft());
    _builder.append(_generateExpression);
    _builder.append(") ");
    String _jsOperator = this.toJsOperator(b.getOperator());
    _builder.append(_jsOperator);
    _builder.append(" (");
    String _generateExpression_1 = this.generateExpression(b.getRight());
    _builder.append(_generateExpression_1);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String toJsOperator(final comparisonOperator op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case GE:
          _switchResult = ">=";
          break;
        case LE:
          _switchResult = "<=";
          break;
        case EQ:
          _switchResult = "==";
          break;
        case GT:
          _switchResult = ">";
          break;
        case LT:
          _switchResult = "<";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  public String toJsOperator(final logicOperator op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case AND:
          _switchResult = "&&";
          break;
        case OR:
          _switchResult = "||";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  public String safeName(final upgrade u) {
    return u.getName().replaceAll("[^a-zA-Z0-9]", "_");
  }

  public String safeName(final achievement a) {
    return a.getName().replaceAll("[^a-zA-Z0-9]", "_");
  }

  @XbaseGenerated
  public String generateEffect(final effect e) {
    if (e instanceof multiplyRateEffect) {
      return _generateEffect((multiplyRateEffect)e);
    } else if (e instanceof reduceCostEffect) {
      return _generateEffect((reduceCostEffect)e);
    } else if (e instanceof unlockGeneratorEffect) {
      return _generateEffect((unlockGeneratorEffect)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }

  @XbaseGenerated
  public String generateExpression(final expression b) {
    if (b instanceof binaryExpression) {
      return _generateExpression((binaryExpression)b);
    } else if (b instanceof comparison) {
      return _generateExpression((comparison)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(b).toString());
    }
  }
}

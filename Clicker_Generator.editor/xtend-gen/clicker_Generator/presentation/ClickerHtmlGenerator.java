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
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class ClickerHtmlGenerator {
  public String generate(final game game) {
    String _xblockexpression = null;
    {
      final Set<String> lockedGenerators = this.collectLockedGenerators(game);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!DOCTYPE html>");
      _builder.newLine();
      _builder.append("<html lang=\"de\">");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<meta charset=\"UTF-8\">");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
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
      _builder.append("<header>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<h1>");
      String _name_1 = game.getName();
      _builder.append(_name_1, "        ");
      _builder.append("</h1>");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("</header>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<section id=\"resources\">");
      _builder.newLine();
      {
        EList<resource> _resources = game.getResources();
        for(final resource r : _resources) {
          _builder.append("        ");
          _builder.append("<div class=\"resource-card\" id=\"card_");
          String _name_2 = r.getName();
          _builder.append(_name_2, "        ");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("        ");
          _builder.append("    ");
          _builder.append("<div class=\"resource-icon\">");
          String _iconMarkup = this.iconMarkup(r);
          _builder.append(_iconMarkup, "            ");
          _builder.append("</div>");
          _builder.newLineIfNotEmpty();
          _builder.append("        ");
          _builder.append("    ");
          _builder.append("<div class=\"resource-info\">");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("        ");
          _builder.append("<div class=\"resource-name\">");
          String _name_3 = r.getName();
          _builder.append(_name_3, "                ");
          _builder.append("</div>");
          _builder.newLineIfNotEmpty();
          _builder.append("        ");
          _builder.append("        ");
          _builder.append("<div class=\"resource-amount\" id=\"res_");
          String _name_4 = r.getName();
          _builder.append(_name_4, "                ");
          _builder.append("\">");
          String _formatStart = this.formatStart(r.getStartAmount());
          _builder.append(_formatStart, "                ");
          _builder.append("</div>");
          _builder.newLineIfNotEmpty();
          _builder.append("        ");
          _builder.append("        ");
          _builder.append("<div class=\"resource-rate\" id=\"rate_");
          String _name_5 = r.getName();
          _builder.append(_name_5, "                ");
          _builder.append("\">+0/s</div>");
          _builder.newLineIfNotEmpty();
          _builder.append("        ");
          _builder.append("    ");
          _builder.append("</div>");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      _builder.append("    ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<section id=\"clicker\">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<button class=\"switch-arrow\" id=\"switch_left\" onclick=\"switchResource(-1)\" aria-label=\"Vorherige Ressource\">◀</button>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<button class=\"cookie-btn\" id=\"cookie\" onclick=\"clickCookie()\">");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<span class=\"cookie-emoji\" id=\"cookie_emoji\">\ud83c\udf6a</span>");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<span class=\"cookie-label\" id=\"cookie_label\">+1</span>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("</button>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<button class=\"switch-arrow\" id=\"switch_right\" onclick=\"switchResource(1)\" aria-label=\"Nächste Ressource\">▶</button>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<p id=\"switch-hint\">Switch Resource</p>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<main>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<section class=\"panel\" id=\"generators\">");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<h2>Generatoren</h2>");
      _builder.newLine();
      {
        EList<generator> _generators = game.getGenerators();
        for(final generator g : _generators) {
          _builder.append("            ");
          _builder.append("<button class=\"buy-btn generator-btn");
          {
            boolean _contains = lockedGenerators.contains(g.getName());
            if (_contains) {
              _builder.append(" locked");
            }
          }
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("        ");
          _builder.append("id=\"btn_");
          String _name_6 = g.getName();
          _builder.append(_name_6, "                    ");
          _builder.append("\" onclick=\"buy");
          String _name_7 = g.getName();
          _builder.append(_name_7, "                    ");
          _builder.append("()\"");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("        ");
          {
            boolean _contains_1 = lockedGenerators.contains(g.getName());
            if (_contains_1) {
              _builder.append("style=\"display:none;\"");
            }
          }
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("    ");
          _builder.append("<span class=\"btn-title\">");
          String _name_8 = g.getName();
          _builder.append(_name_8, "                ");
          _builder.append("</span>");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("    ");
          _builder.append("<span class=\"btn-sub\">produziert ");
          String _name_9 = g.getProduces().getName();
          _builder.append(_name_9, "                ");
          _builder.append(" · besitzt <b id=\"count_");
          String _name_10 = g.getName();
          _builder.append(_name_10, "                ");
          _builder.append("\">0</b></span>");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("    ");
          _builder.append("<span class=\"btn-cost\">Kosten: <span id=\"cost_");
          String _name_11 = g.getName();
          _builder.append(_name_11, "                ");
          _builder.append("\">");
          String _formatStart_1 = this.formatStart(g.getBaseCost());
          _builder.append(_formatStart_1, "                ");
          _builder.append("</span> ");
          String _name_12 = g.getProduces().getName();
          _builder.append(_name_12, "                ");
          _builder.append("</span>");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("</button>");
          _builder.newLine();
        }
      }
      _builder.append("        ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<section class=\"panel\" id=\"upgrades\">");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<h2>Upgrades</h2>");
      _builder.newLine();
      {
        EList<upgrade> _upgrades = game.getUpgrades();
        for(final upgrade u : _upgrades) {
          _builder.append("            ");
          _builder.append("<button class=\"buy-btn upgrade-btn\" id=\"upg_");
          String _safeName = this.safeName(u);
          _builder.append(_safeName, "            ");
          _builder.append("\" onclick=\"buyUpgrade_");
          String _safeName_1 = this.safeName(u);
          _builder.append(_safeName_1, "            ");
          _builder.append("()\">");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("    ");
          _builder.append("<span class=\"btn-title\">");
          String _name_13 = u.getName();
          _builder.append(_name_13, "                ");
          _builder.append("</span>");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("    ");
          _builder.append("<span class=\"btn-cost\">Kosten: <span id=\"upgcost_");
          String _safeName_2 = this.safeName(u);
          _builder.append(_safeName_2, "                ");
          _builder.append("\">");
          String _formatStart_2 = this.formatStart(u.getCost());
          _builder.append(_formatStart_2, "                ");
          _builder.append("</span> ");
          String _costResourceName = this.costResourceName(u, game);
          _builder.append(_costResourceName, "                ");
          _builder.append("</span>");
          _builder.newLineIfNotEmpty();
          _builder.append("            ");
          _builder.append("</button>");
          _builder.newLine();
        }
      }
      _builder.append("        ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<section class=\"panel\" id=\"achievements-panel\">");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<h2>Erfolge</h2>");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<div id=\"achievements\">");
      _builder.newLine();
      {
        EList<achievement> _achievements = game.getAchievements();
        for(final achievement a : _achievements) {
          _builder.append("                ");
          _builder.append("<div class=\"achievement locked\" id=\"ach_");
          String _safeName_3 = this.safeName(a);
          _builder.append(_safeName_3, "                ");
          _builder.append("\">\ud83d\udd12 ");
          String _name_14 = a.getName();
          _builder.append(_name_14, "                ");
          _builder.append("</div>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("            ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</main>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<div id=\"toast-container\"></div>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<script>");
      String _generateJs = this.generateJs(game, lockedGenerators);
      _builder.append(_generateJs, "    ");
      _builder.append("</script>");
      _builder.newLineIfNotEmpty();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  public String generateCss() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(":root {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("--bg: #0f1220;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("--panel: #1b1f33;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("--accent: #7c5cff;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("--accent-2: #37e0c4;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("--text: #e9ecff;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("--muted: #9aa0c3;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("* { box-sizing: border-box; }");
    _builder.newLine();
    _builder.append("body {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("margin: 0; font-family: \'Segoe UI\', system-ui, sans-serif;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background: radial-gradient(circle at top, #1a1f38, var(--bg));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("color: var(--text); padding: 1.5em 2em 4em;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("header h1 {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("text-align: center; font-size: 2.2em; margin-bottom: 0.6em;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background: linear-gradient(90deg, var(--accent), var(--accent-2));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-webkit-background-clip: text; background-clip: text; color: transparent;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#resources {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("display: flex; flex-wrap: wrap; gap: 1em; justify-content: center; margin-bottom: 2em;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".resource-card {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background: var(--panel); border-radius: 14px; padding: 0.8em 1.2em;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("display: flex; align-items: center; gap: 0.7em; min-width: 180px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("box-shadow: 0 4px 14px rgba(0,0,0,0.35); transition: transform 0.15s;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".resource-card:hover { transform: translateY(-2px); }");
    _builder.newLine();
    _builder.append(".resource-icon { font-size: 1.8em; display: flex; align-items: center; justify-content: center; }");
    _builder.newLine();
    _builder.append(".resource-icon-img { width: 1.8em; height: 1.8em; object-fit: contain; border-radius: 6px; }");
    _builder.newLine();
    _builder.append(".resource-name { font-size: 0.8em; color: var(--muted); text-transform: uppercase; letter-spacing: 0.05em; }");
    _builder.newLine();
    _builder.append(".resource-amount { font-size: 1.3em; font-weight: 700; }");
    _builder.newLine();
    _builder.append(".resource-rate { font-size: 0.75em; color: var(--accent-2); }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("main { display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 1.5em; max-width: 1100px; margin: 0 auto; }");
    _builder.newLine();
    _builder.append(".panel { background: var(--panel); border-radius: 16px; padding: 1.2em; }");
    _builder.newLine();
    _builder.append(".panel h2 { margin-top: 0; font-size: 1.1em; color: var(--accent-2); border-bottom: 1px solid #2c3155; padding-bottom: 0.4em; }");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".buy-btn {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("display: flex; flex-direction: column; align-items: flex-start; gap: 0.2em;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("width: 100%; margin: 0.5em 0; padding: 0.7em 1em; border: none; border-radius: 10px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background: #262b4a; color: var(--text); cursor: pointer; text-align: left;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("transition: background 0.15s, transform 0.1s;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".buy-btn:hover:not(.cant-afford) { background: #323a63; transform: translateY(-1px); }");
    _builder.newLine();
    _builder.append(".buy-btn:active:not(.cant-afford) { transform: translateY(0); }");
    _builder.newLine();
    _builder.append(".buy-btn.cant-afford { opacity: 0.45; cursor: not-allowed; }");
    _builder.newLine();
    _builder.append(".buy-btn.bought { opacity: 0.35; cursor: default; }");
    _builder.newLine();
    _builder.append(".btn-title { font-weight: 700; }");
    _builder.newLine();
    _builder.append(".btn-sub, .btn-cost { font-size: 0.8em; color: var(--muted); }");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".achievement { padding: 0.5em 0.7em; margin: 0.4em 0; border-radius: 8px; font-size: 0.9em; background: #262b4a; }");
    _builder.newLine();
    _builder.append(".achievement.locked { color: var(--muted); }");
    _builder.newLine();
    _builder.append(".achievement.unlocked { background: linear-gradient(90deg, #2e6b57, #1b1f33); color: var(--accent-2); }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#toast-container { position: fixed; top: 1em; right: 1em; display: flex; flex-direction: column; gap: 0.5em; z-index: 999; }");
    _builder.newLine();
    _builder.append(".toast {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background: var(--accent); color: white; padding: 0.7em 1.1em; border-radius: 10px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("box-shadow: 0 4px 12px rgba(0,0,0,0.4); animation: toast-in 0.25s ease-out, toast-out 0.4s ease-in 2.6s forwards;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("@keyframes toast-in { from { opacity: 0; transform: translateX(30px); } to { opacity: 1; transform: translateX(0); } }");
    _builder.newLine();
    _builder.append("@keyframes toast-out { to { opacity: 0; transform: translateX(30px); } }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/* --- Clicker (klickbarer Cookie + Ressourcen-Wechsel) --- */");
    _builder.newLine();
    _builder.append("#clicker { display: flex; align-items: center; justify-content: center; gap: 1.5em; margin: 0 auto 0.6em; }");
    _builder.newLine();
    _builder.append(".cookie-btn {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("width: 170px; height: 170px; border-radius: 50%; border: none; cursor: pointer;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("display: flex; flex-direction: column; align-items: center; justify-content: center; gap: 0.25em;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("color: var(--text); background: radial-gradient(circle at 35% 30%, #2b3157, var(--panel));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("box-shadow: 0 8px 24px rgba(0,0,0,0.45), inset 0 0 0 3px #2c3155;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("transition: transform 0.08s ease, box-shadow 0.15s; user-select: none;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".cookie-btn:hover { transform: scale(1.04); box-shadow: 0 10px 28px rgba(124,92,255,0.35), inset 0 0 0 3px var(--accent-2); }");
    _builder.newLine();
    _builder.append(".cookie-btn:active { transform: scale(0.93); }");
    _builder.newLine();
    _builder.append(".cookie-emoji { font-size: 4em; line-height: 1; pointer-events: none; display: flex; align-items: center; justify-content: center; }");
    _builder.newLine();
    _builder.append(".cookie-emoji img { width: 3.2em; height: 3.2em; object-fit: contain; pointer-events: none; }");
    _builder.newLine();
    _builder.append(".cookie-label { font-size: 0.9em; font-weight: 700; color: var(--muted); pointer-events: none; }");
    _builder.newLine();
    _builder.append(".switch-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("width: 54px; height: 54px; border-radius: 50%; border: none; background: #262b4a;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("color: var(--text); font-size: 1.4em; cursor: pointer; transition: background 0.15s, transform 0.1s;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".switch-arrow:hover { background: #323a63; transform: translateY(-1px); }");
    _builder.newLine();
    _builder.append(".switch-arrow:active { transform: scale(0.92); }");
    _builder.newLine();
    _builder.append("#switch-hint { text-align: center; color: var(--muted); font-size: 0.9em; letter-spacing: 0.05em; margin: 0 0 2em; }");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateJs(final game game, final Set<String> lockedGenerators) {
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
    _builder.append("// Basis-Produktionsrate (pro Sekunde) je Ressource, wird jeden Tick neu berechnet");
    _builder.newLine();
    _builder.append("let ratePerSecond = { ");
    {
      EList<resource> _resources_1 = game.getResources();
      boolean _hasElements_1 = false;
      for(final resource r_1 : _resources_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _name_1 = r_1.getName();
        _builder.append(_name_1);
        _builder.append(": 0");
      }
    }
    _builder.append(" };");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<generator> _generators = game.getGenerators();
      for(final generator g : _generators) {
        _builder.append("let count_");
        String _name_2 = g.getName();
        _builder.append(_name_2);
        _builder.append(" = 0;");
        _builder.newLineIfNotEmpty();
        _builder.append("let cost_");
        String _name_3 = g.getName();
        _builder.append(_name_3);
        _builder.append(" = ");
        double _baseCost = g.getBaseCost();
        _builder.append(_baseCost);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("let mult_");
        String _name_4 = g.getName();
        _builder.append(_name_4);
        _builder.append(" = 1; // wird durch multiplyRateEffect-Upgrades verändert");
        _builder.newLineIfNotEmpty();
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
      }
    }
    _builder.newLine();
    {
      EList<achievement> _achievements = game.getAchievements();
      for(final achievement a : _achievements) {
        _builder.append("let unlocked_");
        String _safeName_1 = this.safeName(a);
        _builder.append(_safeName_1);
        _builder.append(" = false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("function formatNumber(n) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (n >= 1e9) return (n / 1e9).toFixed(2) + \'B\';");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (n >= 1e6) return (n / 1e6).toFixed(2) + \'M\';");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (n >= 1e3) return (n / 1e3).toFixed(2) + \'K\';");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return n.toFixed(1);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function showToast(msg) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const el = document.createElement(\'div\');");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("el.className = \'toast\';");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("el.textContent = msg;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("document.getElementById(\'toast-container\').appendChild(el);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setTimeout(() => el.remove(), 3000);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<generator> _generators_1 = game.getGenerators();
      for(final generator g_1 : _generators_1) {
        _builder.append("function buy");
        String _name_5 = g_1.getName();
        _builder.append(_name_5);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (state.");
        String _name_6 = g_1.getProduces().getName();
        _builder.append(_name_6, "    ");
        _builder.append(" >= cost_");
        String _name_7 = g_1.getName();
        _builder.append(_name_7, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("state.");
        String _name_8 = g_1.getProduces().getName();
        _builder.append(_name_8, "        ");
        _builder.append(" -= cost_");
        String _name_9 = g_1.getName();
        _builder.append(_name_9, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("count_");
        String _name_10 = g_1.getName();
        _builder.append(_name_10, "        ");
        _builder.append("++;");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("cost_");
        String _name_11 = g_1.getName();
        _builder.append(_name_11, "        ");
        _builder.append(" *= ");
        double _costGrowth = g_1.getCostGrowth();
        _builder.append(_costGrowth, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("document.getElementById(\'cost_");
        String _name_12 = g_1.getName();
        _builder.append(_name_12, "        ");
        _builder.append("\').innerText = formatNumber(cost_");
        String _name_13 = g_1.getName();
        _builder.append(_name_13, "        ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("document.getElementById(\'count_");
        String _name_14 = g_1.getName();
        _builder.append(_name_14, "        ");
        _builder.append("\').innerText = count_");
        String _name_15 = g_1.getName();
        _builder.append(_name_15, "        ");
        _builder.append(";");
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
      EList<upgrade> _upgrades_1 = game.getUpgrades();
      for(final upgrade u_1 : _upgrades_1) {
        _builder.append("function buyUpgrade_");
        String _safeName_2 = this.safeName(u_1);
        _builder.append(_safeName_2);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (bought_");
        String _safeName_3 = this.safeName(u_1);
        _builder.append(_safeName_3, "    ");
        _builder.append(") return;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (state.");
        String _costResourceName = this.costResourceName(u_1, game);
        _builder.append(_costResourceName, "    ");
        _builder.append(" >= ");
        double _cost = u_1.getCost();
        _builder.append(_cost, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("state.");
        String _costResourceName_1 = this.costResourceName(u_1, game);
        _builder.append(_costResourceName_1, "        ");
        _builder.append(" -= ");
        double _cost_1 = u_1.getCost();
        _builder.append(_cost_1, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("bought_");
        String _safeName_4 = this.safeName(u_1);
        _builder.append(_safeName_4, "        ");
        _builder.append(" = true;");
        _builder.newLineIfNotEmpty();
        {
          EList<effect> _effects = u_1.getEffects();
          for(final effect e : _effects) {
            _builder.append("        ");
            String _generateEffect = this.generateEffect(e);
            _builder.append(_generateEffect, "        ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("        ");
        _builder.append("const btn = document.getElementById(\'upg_");
        String _safeName_5 = this.safeName(u_1);
        _builder.append(_safeName_5, "        ");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("btn.classList.add(\'bought\');");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("btn.disabled = true;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("showToast(\'Upgrade gekauft: ");
        String _name_16 = u_1.getName();
        _builder.append(_name_16, "        ");
        _builder.append("\');");
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
      EList<achievement> _achievements_1 = game.getAchievements();
      for(final achievement a_1 : _achievements_1) {
        _builder.append("function checkAchievement_");
        String _safeName_6 = this.safeName(a_1);
        _builder.append(_safeName_6);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (!unlocked_");
        String _safeName_7 = this.safeName(a_1);
        _builder.append(_safeName_7, "    ");
        _builder.append(" && (");
        String _generateExpression = this.generateExpression(a_1.getCondition());
        _builder.append(_generateExpression, "    ");
        _builder.append(")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("unlocked_");
        String _safeName_8 = this.safeName(a_1);
        _builder.append(_safeName_8, "        ");
        _builder.append(" = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("const el = document.getElementById(\'ach_");
        String _safeName_9 = this.safeName(a_1);
        _builder.append(_safeName_9, "        ");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("el.textContent = \'\ud83c\udfc6 ");
        String _name_17 = a_1.getName();
        _builder.append(_name_17, "        ");
        _builder.append("\';");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("el.classList.remove(\'locked\');");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("el.classList.add(\'unlocked\');");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("showToast(\'Erfolg freigeschaltet: ");
        String _name_18 = a_1.getName();
        _builder.append(_name_18, "        ");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("function updateAffordability() {");
    _builder.newLine();
    {
      EList<generator> _generators_2 = game.getGenerators();
      for(final generator g_2 : _generators_2) {
        _builder.append("    ");
        _builder.append("document.getElementById(\'btn_");
        String _name_19 = g_2.getName();
        _builder.append(_name_19, "    ");
        _builder.append("\').classList.toggle(\'cant-afford\', state.");
        String _name_20 = g_2.getProduces().getName();
        _builder.append(_name_20, "    ");
        _builder.append(" < cost_");
        String _name_21 = g_2.getName();
        _builder.append(_name_21, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<upgrade> _upgrades_2 = game.getUpgrades();
      for(final upgrade u_2 : _upgrades_2) {
        _builder.append("    ");
        _builder.append("if (!bought_");
        String _safeName_10 = this.safeName(u_2);
        _builder.append(_safeName_10, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("document.getElementById(\'upg_");
        String _safeName_11 = this.safeName(u_2);
        _builder.append(_safeName_11, "        ");
        _builder.append("\').classList.toggle(\'cant-afford\', state.");
        String _costResourceName_2 = this.costResourceName(u_2, game);
        _builder.append(_costResourceName_2, "        ");
        _builder.append(" < ");
        double _cost_2 = u_2.getCost();
        _builder.append(_cost_2, "        ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("setInterval(() => {");
    _builder.newLine();
    {
      EList<generator> _generators_3 = game.getGenerators();
      for(final generator g_3 : _generators_3) {
        _builder.append("    ");
        _builder.append("ratePerSecond.");
        String _name_22 = g_3.getProduces().getName();
        _builder.append(_name_22, "    ");
        _builder.append(" = (ratePerSecond.");
        String _name_23 = g_3.getProduces().getName();
        _builder.append(_name_23, "    ");
        _builder.append(" || 0) + count_");
        String _name_24 = g_3.getName();
        _builder.append(_name_24, "    ");
        _builder.append(" * ");
        double _baseRate = g_3.getBaseRate();
        _builder.append(_baseRate, "    ");
        _builder.append(" * mult_");
        String _name_25 = g_3.getName();
        _builder.append(_name_25, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<resource> _resources_2 = game.getResources();
      for(final resource r_2 : _resources_2) {
        _builder.append("    ");
        _builder.append("state.");
        String _name_26 = r_2.getName();
        _builder.append(_name_26, "    ");
        _builder.append(" += (ratePerSecond.");
        String _name_27 = r_2.getName();
        _builder.append(_name_27, "    ");
        _builder.append(" || 0) * 0.1;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("document.getElementById(\'res_");
        String _name_28 = r_2.getName();
        _builder.append(_name_28, "    ");
        _builder.append("\').innerText = formatNumber(state.");
        String _name_29 = r_2.getName();
        _builder.append(_name_29, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("document.getElementById(\'rate_");
        String _name_30 = r_2.getName();
        _builder.append(_name_30, "    ");
        _builder.append("\').innerText = \'+\' + formatNumber(ratePerSecond.");
        String _name_31 = r_2.getName();
        _builder.append(_name_31, "    ");
        _builder.append(" || 0) + \'/s\';");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<resource> _resources_3 = game.getResources();
      for(final resource r_3 : _resources_3) {
        _builder.append("    ");
        _builder.append("ratePerSecond.");
        String _name_32 = r_3.getName();
        _builder.append(_name_32, "    ");
        _builder.append(" = 0;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<achievement> _achievements_2 = game.getAchievements();
      for(final achievement a_2 : _achievements_2) {
        _builder.append("    ");
        _builder.append("checkAchievement_");
        String _safeName_12 = this.safeName(a_2);
        _builder.append(_safeName_12, "    ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("updateAffordability();");
    _builder.newLine();
    _builder.append("}, 100);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// --- Klickbarer Cookie + Ressourcen-Wechsel ---");
    _builder.newLine();
    _builder.append("const resourceList = [");
    {
      EList<resource> _resources_4 = game.getResources();
      boolean _hasElements_2 = false;
      for(final resource r_4 : _resources_4) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append("\'");
        String _name_33 = r_4.getName();
        _builder.append(_name_33);
        _builder.append("\'");
      }
    }
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    _builder.append("// enthält für jede Ressource entweder ein <img>-Tag (falls icon im Modell gesetzt) oder ein Emoji");
    _builder.newLine();
    _builder.append("const resourceIcons = { ");
    {
      EList<resource> _resources_5 = game.getResources();
      boolean _hasElements_3 = false;
      for(final resource r_5 : _resources_5) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_34 = r_5.getName();
        _builder.append(_name_34);
        _builder.append(": `");
        String _iconMarkup = this.iconMarkup(r_5);
        _builder.append(_iconMarkup);
        _builder.append("`");
      }
    }
    _builder.append(" };");
    _builder.newLineIfNotEmpty();
    _builder.append("const clickPower = 1;");
    _builder.newLine();
    _builder.append("let selectedResourceIndex = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function updateClicker() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const res = resourceList[selectedResourceIndex];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (!res) return;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("document.getElementById(\'cookie_emoji\').innerHTML = resourceIcons[res] || \'\ud83c\udf6a\';");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("document.getElementById(\'cookie_label\').innerText = \'+\' + clickPower + \' \' + res;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function clickCookie() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (resourceList.length === 0) return;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const res = resourceList[selectedResourceIndex];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("state[res] += clickPower;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("document.getElementById(\'res_\' + res).innerText = formatNumber(state[res]);");
    _builder.newLine();
    {
      EList<achievement> _achievements_3 = game.getAchievements();
      for(final achievement a_3 : _achievements_3) {
        _builder.append("    ");
        _builder.append("checkAchievement_");
        String _safeName_13 = this.safeName(a_3);
        _builder.append(_safeName_13, "    ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("updateAffordability();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function switchResource(dir) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (resourceList.length === 0) return;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("selectedResourceIndex = (selectedResourceIndex + dir + resourceList.length) % resourceList.length;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("updateClicker();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("updateClicker();");
    _builder.newLine();
    _builder.append("updateAffordability();");
    _builder.newLine();
    return _builder.toString();
  }

  protected String _generateEffect(final multiplyRateEffect e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mult_");
    String _name = e.getTarget().getName();
    _builder.append(_name);
    _builder.append(" *= (");
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
    _builder.append(" *= (");
    double _factor = e.getFactor();
    _builder.append(_factor);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("document.getElementById(\'cost_");
    String _name_1 = e.getTarget().getName();
    _builder.append(_name_1);
    _builder.append("\').innerText = formatNumber(cost_");
    String _name_2 = e.getTarget().getName();
    _builder.append(_name_2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected String _generateEffect(final unlockGeneratorEffect e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("document.getElementById(\'btn_");
    String _name = e.getTarget().getName();
    _builder.append(_name);
    _builder.append("\').style.display = \'flex\';");
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

  public String costResourceName(final upgrade u, final game game) {
    String _xifexpression = null;
    resource _costResource = u.getCostResource();
    boolean _tripleNotEquals = (_costResource != null);
    if (_tripleNotEquals) {
      _xifexpression = u.getCostResource().getName();
    } else {
      String _xifexpression_1 = null;
      boolean _isEmpty = game.getResources().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _xifexpression_1 = game.getResources().get(0).getName();
      } else {
        _xifexpression_1 = "undefined";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  public Set<String> collectLockedGenerators(final game game) {
    final HashSet<String> locked = new HashSet<String>();
    EList<upgrade> _upgrades = game.getUpgrades();
    for (final upgrade u : _upgrades) {
      EList<effect> _effects = u.getEffects();
      for (final effect e : _effects) {
        if ((e instanceof unlockGeneratorEffect)) {
          locked.add(((unlockGeneratorEffect)e).getTarget().getName());
        }
      }
    }
    return locked;
  }

  public String formatStart(final double value) {
    String _xifexpression = null;
    double _floor = Math.floor(value);
    boolean _equals = (value == _floor);
    if (_equals) {
      _xifexpression = String.valueOf(Double.valueOf(value).longValue());
    } else {
      _xifexpression = String.valueOf(value);
    }
    return _xifexpression;
  }

  public String icon(final resource r) {
    String _xblockexpression = null;
    {
      final String n = r.getName().toLowerCase();
      String _xifexpression = null;
      boolean _contains = n.contains("cookie");
      if (_contains) {
        _xifexpression = "\ud83c\udf6a";
      } else {
        String _xifexpression_1 = null;
        if (((n.contains("gold") || n.contains("coin")) || n.contains("geld"))) {
          _xifexpression_1 = "\ud83e\ude99";
        } else {
          String _xifexpression_2 = null;
          if (((n.contains("gem") || n.contains("diamond")) || n.contains("crystal"))) {
            _xifexpression_2 = "\ud83d\udc8e";
          } else {
            String _xifexpression_3 = null;
            if (((n.contains("energy") || n.contains("power")) || n.contains("strom"))) {
              _xifexpression_3 = "⚡";
            } else {
              String _xifexpression_4 = null;
              if ((n.contains("wood") || n.contains("holz"))) {
                _xifexpression_4 = "\ud83e\udeb5";
              } else {
                String _xifexpression_5 = null;
                if ((n.contains("star") || n.contains("stern"))) {
                  _xifexpression_5 = "⭐";
                } else {
                  _xifexpression_5 = "✨";
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public String iconMarkup(final resource r) {
    String _xifexpression = null;
    if (((r.getIcon() != null) && (!r.getIcon().trim().isEmpty()))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<img class=\"resource-icon-img\" src=\"");
      String _icon = r.getIcon();
      _builder.append(_icon);
      _builder.append("\" alt=\"");
      String _name = r.getName();
      _builder.append(_name);
      _builder.append("\"/>");
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = this.icon(r);
    }
    return _xifexpression;
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

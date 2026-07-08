package test

class ClickerHtmlGenerator {

    // === Haupt-Einstiegspunkt ===
    def String generate(clicker_Generator.game game) '''
		<!DOCTYPE html>
		<html>
		<head>
		    <meta charset="UTF-8">
		    <title>«game.name»</title>
		    <style>«generateCss»</style>
		</head>
		<body>
		    <h1>«game.name»</h1>
		    
		    <div id="resources">
		        «FOR r : game.resources»
		        	<div class="resource">
		        	    «r.name»: <span id="res_«r.name»">«r.startAmount»</span>
		        	</div>
		        «ENDFOR»
		    </div>
		
		    <div id="generators">
		    «FOR g : game.generators»
		    	<button id="btn_«g.name»" onclick="buy«g.name»()">
		    	    Buy «g.name» — Cost: <span id="cost_«g.name»">«g.baseCost»</span>
		    	</button>
		    «ENDFOR»
		    </div>
		
		    <div id="upgrades">
		    «FOR u : game.upgrades»
		    	<button id="upg_«u.safeName»" onclick="buyUpgrade_«u.safeName»()">
		    	    «u.name» — Cost: «u.cost»
		    	</button>
		    «ENDFOR»
		    </div>
		
		    <div id="achievements"></div>
		
		    <script>«generateJs(game)»</script>
		</body>
		</html>
	'''

    def String generateCss() '''
		body { font-family: sans-serif; padding: 2em; }
		button { display: block; margin: 0.5em 0; padding: 0.5em 1em; }
		button:disabled { opacity: 0.4; }
	'''

    // === JavaScript-Teil ===
    def String generateJs(clicker_Generator.game game) '''
		let state = {
		    «FOR r : game.resources SEPARATOR ','»
		    	«r.name»: «r.startAmount»
		    «ENDFOR»
		};
		
		«FOR g : game.generators»
			let count_«g.name» = 0;
			let cost_«g.name» = «g.baseCost»;
			
				function buy«g.name»() {
				    if (state.«g.produces.name» >= cost_«g.name») {
				        state.«g.produces.name» -= cost_«g.name»;
				        count_«g.name»++;
				        cost_«g.name» *= «g.costGrowth»;
				        document.getElementById('cost_«g.name»').innerText = cost_«g.name».toFixed(1);
				    }
				}
		«ENDFOR»
		
		«FOR u : game.upgrades»
			let bought_«u.safeName» = false;
			function buyUpgrade_«u.safeName»() {
			    if (!bought_«u.safeName» && state.Cookies >= «u.cost») {
			        «FOR r : game.resources»
			        	state.«r.name» -= «u.cost»;
			        «ENDFOR»
			        bought_«u.safeName» = true;
			        «FOR e : u.effects»
			        	«generateEffect(e)»
			        «ENDFOR»
			        document.getElementById('upg_«u.safeName»').disabled = true;
			    }
			}
		«ENDFOR»
		
		«FOR a : game.achievements»
			function checkAchievement_«a.safeName»() {
			    if (!unlocked_«a.safeName» && («generateExpression(a.condition)»)) {
			        unlocked_«a.safeName» = true;
			        alert("Achievement unlocked: «a.name»");
			    }
			}
			let unlocked_«a.safeName» = false;
		«ENDFOR»
		
		setInterval(() => {
		    «FOR g : game.generators»
		    	state.«g.produces.name» += count_«g.name» * «g.baseRate» * 0.1;
		    «ENDFOR»
		    «FOR r : game.resources»
		    	document.getElementById('res_«r.name»').innerText = state.«r.name».toFixed(1);
		    «ENDFOR»
		    «FOR a : game.achievements»
		    	checkAchievement_«a.safeName»();
		    «ENDFOR»
		}, 100);
	'''

    // === dispatch für Effect-Hierarchie ===
    def dispatch String generateEffect(clicker_Generator.multiplyRateEffect e) '''
		// Rate von «e.target.name» verdoppeln etc.
		globalMultiplier_«e.target.name» = («e.factor»);
	'''

    def dispatch String generateEffect(clicker_Generator.reduceCostEffect e) '''
		cost_«e.target.name» *= «e.factor»;
	'''

    def dispatch String generateEffect(clicker_Generator.unlockGeneratorEffect e) '''
		document.getElementById('btn_«e.target.name»').style.display = 'block';
	'''

    // === dispatch für Expression-Hierarchie (rekursiv!) ===
    def dispatch String generateExpression(clicker_Generator.comparison c) '''
		state.«c.resource.name» «c.operator.toJsOperator» «c.value»
	'''

    def dispatch String generateExpression(clicker_Generator.binaryExpression b) '''
		(«generateExpression(b.left)») «b.operator.toJsOperator» («generateExpression(b.right)»)
	'''

    // === Helfer für Operator-Übersetzung ===
    def String toJsOperator(clicker_Generator.comparisonOperator op) {
        switch (op) {
            case GE: '>='
            case LE: '<='
            case EQ: '=='
            case GT: '>'
            case LT: '<'
        }
    }

    def String toJsOperator(clicker_Generator.logicOperator op) {
        switch (op) {
            case AND: '&&'
            case OR: '||'
        }
    }

    // === Helfer: Namen mit Leerzeichen (STRING-Namen bei Upgrade/Achievement) 
    //     für JS-Identifier sicher machen ===
    def String safeName(clicker_Generator.upgrade u) {
        u.name.replaceAll("[^a-zA-Z0-9]", "_")
    }
    def String safeName(clicker_Generator.achievement a) {
        a.name.replaceAll("[^a-zA-Z0-9]", "_")
    }
}

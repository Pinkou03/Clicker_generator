package clicker_Generator.presentation

import java.util.HashSet
import java.util.Set
import clicker_Generator.generator

class ClickerHtmlGenerator {

	// === Haupt-Einstiegspunkt ===
	def String generate(clicker_Generator.game game) {
		val lockedGenerators = collectLockedGenerators(game)
		'''
			<!DOCTYPE html>
			<html lang="de">
			<head>
			    <meta charset="UTF-8">
			    <meta name="viewport" content="width=device-width, initial-scale=1">
			    <title>«game.name»</title>
			    <style>«generateCss»</style>
			</head>
			<body>
			    <header>
			        <h1>«game.name»</h1>
			    </header>
			
			    <section id="resources">
			    «FOR r : game.resources»
			    	<div class="resource-card" id="card_«r.safeName»">
			    	    <div class="resource-icon">«r.iconMarkup»</div>
			    	    <div class="resource-info">
			    	        <div class="resource-name">«r.name»</div>
			    	        <div class="resource-amount" id="res_«r.safeName»">«r.startAmount.formatStart»</div>
			    	        <div class="resource-rate" id="rate_«r.safeName»">+0/s</div>
			    	    </div>
			    	</div>
			    «ENDFOR»
			    </section>
			
			    <section id="clicker">
			    <button class="switch-arrow" id="switch_left" onclick="switchResource(-1)" aria-label="Vorherige Ressource">◀</button>
			    <button class="cookie-btn" id="cookie" onclick="clickCookie()">
			        <span class="cookie-emoji" id="cookie_emoji">🍪</span>
			        <span class="cookie-label" id="cookie_label">+1</span>
			    </button>
			    <button class="switch-arrow" id="switch_right" onclick="switchResource(1)" aria-label="Nächste Ressource">▶</button>
			    </section>
			    <p id="switch-hint">Switch Resource</p>
			
			    <main>
			    <section class="panel" id="generators">
			        <h2>Generatoren</h2>
			        «FOR g : game.generators»
			        	<button class="buy-btn generator-btn«IF lockedGenerators.contains(g.safeName)» locked«ENDIF»"
			        	        id="btn_«g.safeName»" onclick="buy«g.safeName»()"
			        	        «IF lockedGenerators.contains(g.safeName)»style="display:none;"«ENDIF»>
			        	<span class="btn-title">«g.name»</span>
			        	<span class="btn-sub">produziert «g.produces.name» · besitzt <b id="count_«g.safeName»">0</b></span>
			        	<span class="btn-cost">Kosten: <span id="cost_«g.safeName»">«g.baseCost.formatStart»</span> «g.produces.name»</span>
			        	</button>
			        «ENDFOR»
			    </section>
			
			        <section class="panel" id="upgrades">
			    <h2>Upgrades</h2>
			    «FOR u : game.upgrades»
			    	<button class="buy-btn upgrade-btn" id="upg_«u.safeName»" onclick="buyUpgrade_«u.safeName»()">
			    	    <span class="btn-title">«u.name»</span>
			    	    <span class="btn-cost">Kosten: <span id="upgcost_«u.safeName»">«u.cost.formatStart»</span> «u.costResourceName(game)»</span>
			    	</button>
			    «ENDFOR»
			        </section>
			
			        <section class="panel" id="achievements-panel">
			    <h2>Erfolge</h2>
			    <div id="achievements">
			        «FOR a : game.achievements»
			        	<div class="achievement locked" id="ach_«a.safeName»">🔒 «a.name»</div>
			        «ENDFOR»
			    </div>
			        </section>
			    </main>
			
			    <div id="toast-container"></div>
			
			    <script>«generateJs(game, lockedGenerators)»</script>
			</body>
			</html>
		'''
	}

	def String generateCss() '''
		:root {
		    --bg: #0f1220;
		    --panel: #1b1f33;
		    --accent: #7c5cff;
		    --accent-2: #37e0c4;
		    --text: #e9ecff;
		    --muted: #9aa0c3;
		}
		* { box-sizing: border-box; }
		body {
		    margin: 0; font-family: 'Segoe UI', system-ui, sans-serif;
		    background: radial-gradient(circle at top, #1a1f38, var(--bg));
		    color: var(--text); padding: 1.5em 2em 4em;
		}
		header h1 {
		    text-align: center; font-size: 2.2em; margin-bottom: 0.6em;
		    background: linear-gradient(90deg, var(--accent), var(--accent-2));
		    -webkit-background-clip: text; background-clip: text; color: transparent;
		}
		#resources {
		    display: flex; flex-wrap: wrap; gap: 1em; justify-content: center; margin-bottom: 2em;
		}
		.resource-card {
		    background: var(--panel); border-radius: 14px; padding: 0.8em 1.2em;
		    display: flex; align-items: center; gap: 0.7em; min-width: 180px;
		    box-shadow: 0 4px 14px rgba(0,0,0,0.35); transition: transform 0.15s;
		}
		.resource-card:hover { transform: translateY(-2px); }
		.resource-icon { font-size: 1.8em; display: flex; align-items: center; justify-content: center; }
		.resource-icon-img { width: 1.8em; height: 1.8em; object-fit: contain; border-radius: 6px; }
		.resource-name { font-size: 0.8em; color: var(--muted); text-transform: uppercase; letter-spacing: 0.05em; }
		.resource-amount { font-size: 1.3em; font-weight: 700; }
		.resource-rate { font-size: 0.75em; color: var(--accent-2); }
		
		main { display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 1.5em; max-width: 1100px; margin: 0 auto; }
		.panel { background: var(--panel); border-radius: 16px; padding: 1.2em; }
		.panel h2 { margin-top: 0; font-size: 1.1em; color: var(--accent-2); border-bottom: 1px solid #2c3155; padding-bottom: 0.4em; }
		
		.buy-btn {
		    display: flex; flex-direction: column; align-items: flex-start; gap: 0.2em;
		    width: 100%; margin: 0.5em 0; padding: 0.7em 1em; border: none; border-radius: 10px;
		    background: #262b4a; color: var(--text); cursor: pointer; text-align: left;
		    transition: background 0.15s, transform 0.1s;
		}
		.buy-btn:hover:not(.cant-afford) { background: #323a63; transform: translateY(-1px); }
		.buy-btn:active:not(.cant-afford) { transform: translateY(0); }
		.buy-btn.cant-afford { opacity: 0.45; cursor: not-allowed; }
		.buy-btn.bought { opacity: 0.35; cursor: default; }
		.btn-title { font-weight: 700; }
		.btn-sub, .btn-cost { font-size: 0.8em; color: var(--muted); }
		
		.achievement { padding: 0.5em 0.7em; margin: 0.4em 0; border-radius: 8px; font-size: 0.9em; background: #262b4a; }
		.achievement.locked { color: var(--muted); }
		.achievement.unlocked { background: linear-gradient(90deg, #2e6b57, #1b1f33); color: var(--accent-2); }
		
		#toast-container { position: fixed; top: 1em; right: 1em; display: flex; flex-direction: column; gap: 0.5em; z-index: 999; }
		.toast {
		    background: var(--accent); color: white; padding: 0.7em 1.1em; border-radius: 10px;
		    box-shadow: 0 4px 12px rgba(0,0,0,0.4); animation: toast-in 0.25s ease-out, toast-out 0.4s ease-in 2.6s forwards;
		}
		@keyframes toast-in { from { opacity: 0; transform: translateX(30px); } to { opacity: 1; transform: translateX(0); } }
		@keyframes toast-out { to { opacity: 0; transform: translateX(30px); } }
		
		/* --- Clicker (klickbarer Cookie + Ressourcen-Wechsel) --- */
		#clicker { display: flex; align-items: center; justify-content: center; gap: 1.5em; margin: 0 auto 0.6em; }
		.cookie-btn {
		    width: 170px; height: 170px; border-radius: 50%; border: none; cursor: pointer;
		    display: flex; flex-direction: column; align-items: center; justify-content: center; gap: 0.25em;
		    color: var(--text); background: radial-gradient(circle at 35% 30%, #2b3157, var(--panel));
		    box-shadow: 0 8px 24px rgba(0,0,0,0.45), inset 0 0 0 3px #2c3155;
		    transition: transform 0.08s ease, box-shadow 0.15s; user-select: none;
		}
		.cookie-btn:hover { transform: scale(1.04); box-shadow: 0 10px 28px rgba(124,92,255,0.35), inset 0 0 0 3px var(--accent-2); }
		.cookie-btn:active { transform: scale(0.93); }
		.cookie-emoji { font-size: 4em; line-height: 1; pointer-events: none; display: flex; align-items: center; justify-content: center; }
		.cookie-emoji img { width: 3.2em; height: 3.2em; object-fit: contain; pointer-events: none; }
		.cookie-label { font-size: 0.9em; font-weight: 700; color: var(--muted); pointer-events: none; }
		.switch-arrow {
		    width: 54px; height: 54px; border-radius: 50%; border: none; background: #262b4a;
		    color: var(--text); font-size: 1.4em; cursor: pointer; transition: background 0.15s, transform 0.1s;
		}
		.switch-arrow:hover { background: #323a63; transform: translateY(-1px); }
		.switch-arrow:active { transform: scale(0.92); }
		#switch-hint { text-align: center; color: var(--muted); font-size: 0.9em; letter-spacing: 0.05em; margin: 0 0 2em; }
		
		/* --- Events (golden-cookie style) --- */
		.golden-cookie {
		    position: fixed; width: 64px; height: 64px; border: none; background: transparent;
		    font-size: 2.6em; cursor: pointer; z-index: 998; filter: drop-shadow(0 0 10px gold);
		    animation: golden-pulse 1s ease-in-out infinite;
		}
		.golden-cookie img { width: 1em; height: 1em; object-fit: contain; pointer-events: none; }
		@keyframes golden-pulse { 0%,100% { transform: scale(1); } 50% { transform: scale(1.15); } }
	'''

	// === JavaScript-Teil ===
	def String generateJs(clicker_Generator.game game, Set<String> lockedGenerators) '''
		let state = {
		    «FOR r : game.resources SEPARATOR ','»
		    	«r.safeName»: «r.startAmount»
		    «ENDFOR»
		};
		
		// Basis-Produktionsrate (pro Sekunde) je Ressource, wird jeden Tick neu berechnet
		let ratePerSecond = { «FOR r : game.resources SEPARATOR ','»«r.safeName»: 0«ENDFOR» };
		
		«FOR g : game.generators»
			let count_«g.safeName» = 0;
			let cost_«g.safeName» = «g.baseCost»;
			let mult_«g.safeName» = 1; // wird durch multiplyRateEffect-Upgrades verändert
		«ENDFOR»
		
		«FOR u : game.upgrades»
			let bought_«u.safeName» = false;
		«ENDFOR»
		
		«FOR a : game.achievements»
			let unlocked_«a.safeName» = false;
		«ENDFOR»
		
		function formatNumber(n) {
		    if (n >= 1e9) return (n / 1e9).toFixed(2) + 'B';
		    if (n >= 1e6) return (n / 1e6).toFixed(2) + 'M';
		    if (n >= 1e3) return (n / 1e3).toFixed(2) + 'K';
		    return n.toFixed(1);
		}
		
		function showToast(msg) {
		    const el = document.createElement('div');
		    el.className = 'toast';
		    el.textContent = msg;
		    document.getElementById('toast-container').appendChild(el);
		    setTimeout(() => el.remove(), 3000);
		}
		
		«FOR g : game.generators»
			function buy«g.safeName»() {
			    if (state.«g.produces.safeName» >= cost_«g.safeName») {
			        state.«g.produces.safeName» -= cost_«g.safeName»;
			        count_«g.safeName»++;
			        cost_«g.safeName» *= «g.costGrowth»;
			        document.getElementById('cost_«g.safeName»').innerText = formatNumber(cost_«g.safeName»);
			        document.getElementById('count_«g.safeName»').innerText = count_«g.safeName»;
			    }
			}
		«ENDFOR»
		
		«FOR u : game.upgrades»
			function buyUpgrade_«u.safeName»() {
			    if (bought_«u.safeName») return;
			    if (state.«u.costResourceSafeName(game)» >= «u.cost») {
			        state.«u.costResourceSafeName(game)» -= «u.cost»;
			        bought_«u.safeName» = true;
			        «FOR e : u.effects»
			        	«generateEffect(e)»
			        «ENDFOR»
			        const btn = document.getElementById('upg_«u.safeName»');
			        btn.classList.add('bought');
			        btn.disabled = true;
			        showToast('Upgrade gekauft: «u.name»');
			    }
			}
		«ENDFOR»
		
		«FOR a : game.achievements»
			function checkAchievement_«a.safeName»() {
			    if (!unlocked_«a.safeName» && («generateExpression(a.condition)»)) {
			        unlocked_«a.safeName» = true;
			        const el = document.getElementById('ach_«a.safeName»');
			        el.textContent = '🏆 «a.name»';
			        el.classList.remove('locked');
			        el.classList.add('unlocked');
			        showToast('Erfolg freigeschaltet: «a.name»');
			    }
			}
		«ENDFOR»
		
		function updateAffordability() {
		    «FOR g : game.generators»
		    	document.getElementById('btn_«g.safeName»').classList.toggle('cant-afford', state.«g.produces.safeName» < cost_«g.safeName»);
		    «ENDFOR»
		    «FOR u : game.upgrades»
		    	if (!bought_«u.safeName») {
		    	    document.getElementById('upg_«u.safeName»').classList.toggle('cant-afford', state.«u.costResourceSafeName(game)» < «u.cost»);
		    	}
		    «ENDFOR»
		}
		
		setInterval(() => {
		    «FOR g : game.generators»
		    	ratePerSecond.«g.produces.safeName» = (ratePerSecond.«g.produces.safeName» || 0) + count_«g.safeName» * «g.baseRate» * mult_«g.safeName»;
		    «ENDFOR»
		    «FOR r : game.resources»
		    	state.«r.safeName» += (ratePerSecond.«r.safeName» || 0) * 0.1;
		    	document.getElementById('res_«r.safeName»').innerText = formatNumber(state.«r.safeName»);
		    	document.getElementById('rate_«r.safeName»').innerText = '+' + formatNumber(ratePerSecond.«r.safeName» || 0) + '/s';
		    «ENDFOR»
		    «FOR r : game.resources»
		    	ratePerSecond.«r.safeName» = 0;
		    «ENDFOR»
		    «FOR a : game.achievements»
		    	checkAchievement_«a.safeName»();
		    «ENDFOR»
		    updateAffordability();
		}, 100);
		
		// --- Klickbarer Cookie + Ressourcen-Wechsel ---
		// resourceList enthält die Anzeige-Namen (mit Leerzeichen etc.), resourceKeys
		// an gleicher Position die JS-sicheren Keys (Leerzeichen -> Unterstrich),
		// mit denen state/ratePerSecond/resourceIcons intern indiziert werden.
		const resourceList = [«FOR r : game.resources SEPARATOR ', '»'«r.name»'«ENDFOR»];
		const resourceKeys = [«FOR r : game.resources SEPARATOR ', '»'«r.safeName»'«ENDFOR»];
		// enthält für jede Ressource entweder ein <img>-Tag (falls icon im Modell gesetzt) oder ein Emoji
		const resourceIcons = { «FOR r : game.resources SEPARATOR ', '»«r.safeName»: `«r.iconMarkup»`«ENDFOR» };
		const clickPower = 1;
		let selectedResourceIndex = 0;
		
		function updateClicker() {
		    const res = resourceList[selectedResourceIndex];
		    const key = resourceKeys[selectedResourceIndex];
		    if (!res) return;
		    document.getElementById('cookie_emoji').innerHTML = resourceIcons[key] || '🍪';
		    document.getElementById('cookie_label').innerText = '+' + clickPower + ' ' + res;
		}
		
		function clickCookie() {
		    if (resourceList.length === 0) return;
		    const key = resourceKeys[selectedResourceIndex];
		    state[key] += clickPower;
		    document.getElementById('res_' + key).innerText = formatNumber(state[key]);
		    «FOR a : game.achievements»
		    	checkAchievement_«a.safeName»();
		    «ENDFOR»
		    updateAffordability();
		}
		
		function switchResource(dir) {
		    if (resourceList.length === 0) return;
		    selectedResourceIndex = (selectedResourceIndex + dir + resourceList.length) % resourceList.length;
		    updateClicker();
		}
		
		updateClicker();
		updateAffordability();
		
		// === Events (model-driven: x% Chance alle y Sekunden, pro Generator/Resource) ===
		«FOR e : game.events»
			(function() {
			    const chance = «e.chance»;
			    const intervalMs = «e.intervalSeconds» * 1000;
			    const durationMs = «e.durationSeconds» * 1000;
		
			function apply_«e.safeName»() {
			    «FOR ef : e.effects»
			    	«generateEventEffectApply(ef)»
			    «ENDFOR»
			    showToast('Event: «e.name»');
			    updateAffordability();
			    «IF e.durationSeconds > 0»
			    	setTimeout(() => {
			    	    «FOR ef : e.effects»
			    	    	«generateEventEffectRevert(ef)»
			    	    «ENDFOR»
			    	    updateAffordability();
			    	}, durationMs);
			    «ENDIF»
			}
		
			function spawn_«e.safeName»() {
			    if (document.getElementById('event_«e.safeName»')) return; // nur eins gleichzeitig pro Event
			    const el = document.createElement('button');
			    el.id = 'event_«e.safeName»';
			    el.className = 'golden-cookie';
			    el.title = '«e.name»';
			    el.innerHTML = '«e.iconMarkup»';
			    el.style.top = (10 + Math.random() * 70) + '%';
			    el.style.left = (10 + Math.random() * 80) + '%';
			    el.onclick = () => { el.remove(); apply_«e.safeName»(); };
			    document.body.appendChild(el);
			    setTimeout(() => el.remove(), 8000);
			}
		
			setInterval(() => {
			    if (Math.random() < chance) spawn_«e.safeName»();
			}, intervalMs);
			})();
		«ENDFOR»
	'''

	// === dispatch für Effect-Hierarchie ===
	def dispatch String generateEffect(clicker_Generator.multiplyRateEffect e) '''
		mult_«e.target.safeName» *= («e.factor»);
	'''

	def dispatch String generateEffect(clicker_Generator.reduceCostEffect e) '''
		cost_«e.target.safeName» *= («e.factor»);
		document.getElementById('cost_«e.target.safeName»').innerText = formatNumber(cost_«e.target.safeName»);
	'''

	def dispatch String generateEffect(clicker_Generator.unlockGeneratorEffect e) '''
		document.getElementById('btn_«e.target.safeName»').style.display = 'flex';
	'''

	// === dispatch für Event-Effekte: anwenden (apply) ===
	// multiplyRateEffect wird hier als TEMPORÄRER Boost benutzt (siehe revert unten),
	// reduceCostEffect/unlockGeneratorEffect wirken wie gehabt dauerhaft.
	def dispatch String generateEventEffectApply(clicker_Generator.multiplyRateEffect e) '''
		mult_«e.target.safeName» *= («e.factor»);
	'''

	def dispatch String generateEventEffectApply(clicker_Generator.effect e) '''
		«generateEffect(e)»
	'''

	// === dispatch für Event-Effekte: zurücksetzen (revert) nach durationSeconds ===
	// Nur multiplyRateEffect ist reversibel (Boost läuft ab); alles andere bleibt dauerhaft.
	def dispatch String generateEventEffectRevert(clicker_Generator.multiplyRateEffect e) '''
		mult_«e.target.safeName» /= («e.factor»);
	'''

	def dispatch String generateEventEffectRevert(clicker_Generator.effect e) ''''''

	// === dispatch für Expression-Hierarchie (rekursiv!) ===
	def dispatch String generateExpression(clicker_Generator.comparison c) '''
		state.«c.resource.safeName» «c.operator.toJsOperator» «c.value»
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

	// === Helfer: welche Ressource bezahlt ein Upgrade? ===
	// Nutzt die neue costResource-Referenz; fällt auf die erste Ressource
	// im Spiel zurück, falls im Modell (noch) keine gesetzt ist, damit
	// alte Modelle nicht sofort kaputtgehen.
	def String costResourceName(clicker_Generator.upgrade u, clicker_Generator.game game) {
		if (u.costResource !== null) {
			u.costResource.name
		} else if (!game.resources.empty) {
			game.resources.get(0).name
		} else {
			'undefined'
		}
	}

	// === Helfer: wie costResourceName, aber als JS-sicherer Key (für state.«...» Zugriffe) ===
	def String costResourceSafeName(clicker_Generator.upgrade u, clicker_Generator.game game) {
		if (u.costResource !== null) {
			u.costResource.safeName
		} else if (!game.resources.empty) {
			game.resources.get(0).safeName
		} else {
			'undefined'
		}
	}

	// === Helfer: welche Generatoren sind zu Beginn gesperrt,
	// weil sie Ziel eines unlockGeneratorEffect sind? ===
	def Set<String> collectLockedGenerators(clicker_Generator.game game) {
		val locked = new HashSet<String>()
		for (u : game.upgrades) {
			for (e : u.effects) {
				if (e instanceof clicker_Generator.unlockGeneratorEffect) {
					locked.add(e.target.safeName)
				}
			}
		}
		return locked
	}

	// === Helfer: hübsche Startwert-Formatierung ohne unnötige Nachkommastellen ===
	def String formatStart(double value) {
		if (value == Math.floor(value)) {
			String.valueOf(value.longValue)
		} else {
			String.valueOf(value)
		}
	}

	// === Helfer: Emoji-Icon je nach Ressourcenname (rein kosmetisch, nur Fallback) ===
	def String icon(clicker_Generator.resource r) {
		val n = r.name.toLowerCase
		if (n.contains('cookie'))
			'🍪'
		else if (n.contains('gold') || n.contains('coin') || n.contains('geld'))
			'🪙'
		else if (n.contains('gem') || n.contains('diamond') || n.contains('crystal'))
			'💎'
		else if (n.contains('energy') || n.contains('power') || n.contains('strom'))
			'⚡'
		else if (n.contains('wood') || n.contains('holz'))
			'🪵'
		else if(n.contains('star') || n.contains('stern')) '⭐' else '✨'
	}

	// === Icon-Auswahl: bevorzugt das im Modell gesetzte Bild (r.icon) als <img>-Tag,
	// fällt sonst auf ein anhand des Namens geratenes Emoji zurück.
	// Wird sowohl für die Resource-Card als auch für den Cookie-Button genutzt. ===
	def String iconMarkup(clicker_Generator.resource r) {
		if (r.icon !== null && !r.icon.trim.empty) {
			'''<img class="resource-icon-img" src="«r.icon»" alt="«r.name»"/>'''
		} else {
			icon(r)
		}
	}

	def String iconMarkup(clicker_Generator.event e) {
		if (e.icon !== null && !e.icon.trim.empty) {
			'''<img src="«e.icon»" alt="«e.name»"/>'''
		} else {
			'✨'
		}
	}

	// === Helfer: Namen mit Leerzeichen (STRING-Namen bei Upgrade/Achievement)
	// für JS-Identifier sicher machen ===
	def String safeName(clicker_Generator.upgrade u) {
		u.name.replaceAll("[^a-zA-Z0-9]", "_")
	}

	def String safeName(clicker_Generator.achievement a) {
		a.name.replaceAll("[^a-zA-Z0-9]", "_")
	}

	def String safeName(clicker_Generator.event e) {
		e.name.replaceAll("[^a-zA-Z0-9]", "_")
	}

	def String safeName(clicker_Generator.generator e) {
		e.name.replaceAll("[^a-zA-Z0-9]", "_")
	}

	def String safeName(clicker_Generator.resource r) {
		r.name.replaceAll("[^a-zA-Z0-9]", "_")
	}
}

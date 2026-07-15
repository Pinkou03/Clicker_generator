# Clicker Generator

Ein modellgetriebener Generator für Incremental-/Clicker-Games à la Cookie Clicker. Man modelliert sein Spiel in EMF — Ressourcen, Generatoren, Upgrades, Erfolge, Events — und bekommt eine fertig spielbare HTML-Datei mit eingebettetem CSS und JavaScript.

Basiert auf EMF und Xtend, aufgeteilt in drei Eclipse-Plug-in-Projekte. Java 21.

## Projekte

- **`Clicker_Generator`** — Metamodell (`model/clicker_Generator.ecore`), GenModel, generierter Code.
- **`Clicker_Generator.edit`** — ItemProvider für den Baum-Editor.
- **`Clicker_Generator.editor`** — Editor und Code-Generierung (`ClickerHtmlGenerator.xtend`, `GeneratorTest.java`).

## Metamodell in Kürze

Wurzel ist `game` mit Listen von:

- **`resource`** — Name, Startmenge, optionales Icon.
- **`generator`** — produziert eine Ressource mit `baseRate` pro Sekunde; `baseCost` steigt pro Kauf um `costGrowth`.
- **`upgrade`** — kostet eine Ressource, hat einen oder mehrere Effekte, kann andere Upgrades voraussetzen.
- **`achievement`** — wird bei erfüllter Bedingung freigeschaltet.
- **`event`** — tritt im `intervalSeconds`-Takt mit Wahrscheinlichkeit `chance` ein und wirkt `durationSeconds` lang.

**Effekte:** Rate multiplizieren, Kosten senken, Generator freischalten, Ressource verschenken.

**Bedingungen:** Vergleiche (`Cookies >= 100`), verknüpfbar mit `AND`/`OR` und beliebig verschachtelbar.

## Was rauskommt

Eine einzelne HTML-Datei mit Ressourcen-Karten, Klick-Button, Generator- und Upgrade-Buttons, Erfolgen, Zufalls-Events, Toast-Benachrichtigungen und einem Tick alle 100 ms. Icons kommen aus dem Modell oder werden per Emoji aus dem Ressourcennamen geraten (cookie → 🍪, gold → 🪙 …).

## Benutzung

**Voraussetzungen:** Eclipse (Modeling Tools bzw. IDE for Java and DSL Developers) mit EMF und Xtend, JDK 21.

1. Die drei Projekte in einen Workspace importieren.
2. Runtime-Instanz starten: Rechtsklick auf `Clicker_Generator.editor` → *Run As → Eclipse Application*.
3. Dort ein Modell anlegen: *File → New → Other → Clicker_Generator Model* (Endung `.clicker_generator`), Wurzelelement `game`.
4. Im Baum-Editor Elemente anlegen, Werte im Properties-View setzen.
5. Rechtsklick auf die `.clicker_generator`-Datei → **GeneratorCommand**.
6. Ergebnis: `output/clickerGame.html` — im Browser öffnen.

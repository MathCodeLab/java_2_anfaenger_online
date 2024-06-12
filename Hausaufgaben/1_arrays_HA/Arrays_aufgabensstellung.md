### Java Übung: Verwaltung eines Lagers in einem Supermarkt

Diese Übung hilft dir, die Grundlagen der Array-Verwaltung und der Manipulation von Daten in Arrays in Java zu verstehen.

#### Aufgabenstellung:

Erstelle ein Java-Programm, das die Verwaltung eines Lagers in einem Supermarkt ermöglicht. Verwende parallele Arrays, um die Informationen der Artikel zu speichern und implementiere die Logik zur Verwaltung des Lagers direkt in der `main`-Methode, **ohne zusätzliche Methoden oder Klassen.**

#### Anforderungen:
1. **Lager**: Verwende drei parallele Arrays, um die Informationen der Artikel zu speichern:
    - `String[] productNames`: Die Namen der Produkte.
    - `int[] quantities`: Die verfügbaren Mengen der Produkte.
    - `double[] prices`: Die Preise der Produkte.

2. **Operationen**: Implementiere folgende Funktionen direkt in der `main`-Methode:
    - **Hinzufügen eines Produkts**: Füge neue Produkte zum Lager hinzu, bis die Kapazität des Arrays erreicht ist.
    - **Entfernen eines Produkts basierend auf dem Produktnamen**: Entferne ein Produkt aus dem Lager.
    - **Suchen eines Produkts nach dem Namen**: Suche nach einem Produkt im Lager nach dem Namen und gib die Informationen des gefundenen Produkts aus.
    - **Anzeigen aller Produkte im Lager**: Gib alle Produkte im Lager auf der Konsole aus.

#### Detaillierte Schritte:

1. **Initialisierung**:
    - Erstelle drei Arrays für Produktnamen, Mengen und Preise der Produkte mit einer Kapazität von 10.
    - Definiere eine Variable `count`, um die Anzahl der Produkte im Lager zu verfolgen.

2. **Operationen implementieren**:
    - **Hinzufügen eines Produkts**: Füge neue Produkte zum Lager hinzu, indem du die Informationen direkt in die Arrays speicherst.
    - **Entfernen eines Produkts**: Entferne ein Produkt aus dem Lager, indem du den letzten Eintrag an die Position des zu entfernenden Eintrags verschiebst.
    - **Suchen eines Produkts**: Durchsuche das Array der Produktnamen nach einem bestimmten Namen.
    - **Anzeigen aller Produkte**: Gib alle Produkte im Lager auf der Konsole aus.

Viel Erfolg!
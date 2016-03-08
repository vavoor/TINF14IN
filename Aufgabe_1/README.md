# Aufgabe 1: Eine DSL für Moore-Automaten

Bei dieser Aufgabe geht es darum, aus der Beschreibung eines Moore-Automaten Java-Code zu erzeugen. Dazu soll ein
Recursive Descent Parser entwickelt werden, der die Beschreibung einliest und einen abstrakten Syntaxbaum (AST) für die
Eingabe erzeugt. Auf dem AST sollen die semantischen Prüfungen und die Code-Generierung erfolgen.

## Implementierungsschritte

Bei der Umsetzung der Aufgabe bieten sich folgende Schritte an:

* Grammatik aufstellen
* Recursive Descent Parser implementieren und testen.
* Semantische Aktionen implementieren, um den AST aufzubauen, und den AST zu Testzwecken ausgeben
* Semantische Prüfungen als Methoden der AST-Knoten implementieren
* Code-Generierung als Methoden der AST-Knoten implementieren

Die Wahl der Programmiersprache bleibt Ihnen überlassen. Wenn Sie die Aufgabe in Java implementieren, können Sie die
Klassen im Verzeichnis `src` benutzen.


## Beispiel

Dieser Automat ...

    start Initial
    state Initial:
      do prepare
      on start goto Started
    state Started:
      do start
      on stop goto Stopped
    state Stopped:
      do stop
      on init goto Initial
      on start goto Started

soll in diesen Java-Code übersetzt werden:

FSMActions.java:

    interface FSMActions {
      void prepare();
      void start();
      void stop();
    }

FSM.java:

    class FSM {
      enum STATES {
        Initial {
          STATES start(FSMActions actions) {
            actions.start();
            return Started;
          }
        },
        Started {
          STATES stop(FSMActions actions) {
            actions.stop();
            return Stopped;
          }
        },
        Stopped {
          STATES init(FSMActions actions) {
            actions.prepare();
            return Initial;
          }
          STATES start(FSMActions actions) {
            actions.start();
            return Started;
          }
        };

        STATES init(FSMActions actions) {
          illegal("prepare");
          return this;
        }
        STATES start(FSMActions actions) {
          illegal("start");
          return this;
        }
        STATES stop(FSMActions actions) {
          illegal("stop");
          return this;
        }

        private void illegal(String event) {
          System.out.println("Unexpected event "+event+" in state "+this+"\n");
        }
      }

      private STATES state;
      private FSMActions actions;

      public FSM(FSMActions actions) {
        this.actions = actions;
        state = STATES.Initial;
        actions.prepare();
      }

      public void start() {
        state = state.start(actions);
      }

      public void stop() {
        state = state.stop(actions);
      }

      public void init() {
        state = state.init(actions);
      }
    }


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DFA {
    private int state;

    private static final String[] ErrorTable = new String[]
    {
        "", //Consistencia de indices 
        "E1 - Error de sintaxis: se esperaba la parabra reservada 'ENCENDER'",
        "E2 - Error de sintaxis: se esperaba el caracter ';'",
        "E3 - Error de sintaxis: se esperaba un ' '",
        "E4 - Error de sintaxis: se esperaba un Enter",
        "E5 - Error de sintaxis: se esperaba la palabra reservada 'PARPADEAS_LED'",
        "E6 - Error de sintaxis: se esperaba el caracter '('",
        "E7 - Error de sintaxis: se esperaba el simbolo 'pi'",
        "E8 - Error de sintaxis: se esperaba el caracter ')' y el simbolo 'pi'",
        "E9 - Error: sintaxis invalida",
        "E10 - Error de sintaxis: se esperaba el caracter '='",
        "E11 - Error de sintaxis: se esperaba el caracter '{'",
        "E12 - Error de sintaxis: se esperaba un valor entre el 1,2 o 3",
        "E13 - Error de sintaxis: se esperaba el caracter '}'",
        "E14 - Error de sintaxis: se esperaba un valor entre el 5, 10 o 20",
        "E15 - Error de sintaxis: se esperaba la palabra reservada 'LICUAR'",
        "E16 - Error de sintaxis: se esperaba el caracter ','"
    };

    /**
     * La funcion delta muestra loS recorridos del automata
     * @param s El estado en donde se encuentra
     * @param c El valor de la transicion
     * @return El estado correspondiente con un determinado valor c 
     */

    static private int delta(int s, String c) {
        switch (s) {
            case 1: {
                switch (c) {
                    case "ON": return 2;
                    default: throw new Error(ErrorTable[1]);
                }
            }
            case 2: {
                switch (c) {
                    case "pc": return 3;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 3: {
                switch (c) {
                    case "es": return 4;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 4: {
                switch (c) {
                    case "en": return 5;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 5: {
                switch (c) {
                    case "en": return 5;
                    case "PP": return 6;
                    default: throw new Error(ErrorTable[5]);
                }
            }
            case 6: {
                switch (c) {
                    case "pi": return 7;
                    default: throw new Error(ErrorTable[6]);
                }
            }
            case 7: {
                switch (c) {
                    case "pl": return 8;
                    default: throw new Error(ErrorTable[7]);
                }
            }
            case 8: {
                switch (c) {
                    case "pf": return 9;
                    case "pl":return 8;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 9: {
                switch (c) {
                    case "pc": return 10;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 10: {
                switch (c) {
                    case "es": return 11;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 11: {
                switch (c) {
                    case "en": return 12;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 12: {
                switch (c) {
                    case "en": return 12;
                    case "VL": return 15;
                    case "TI": return 33;
                    case "LC": return 50;
                    case "OFF": return 104;
                    default: throw new Error(ErrorTable[9]);
                }
            }
            case 15: {
                switch (c) {
                    case "ig": return 16;
                    default: throw new Error(ErrorTable[10]);
                }
            }
            case 16: {
                switch (c) {
                    case "li": return 17;
                    default: throw new Error(ErrorTable[11]);
                }
            }
            case 17: {
                switch (c) {
                    case "1": return 19;
                    case "2": return 21;
                    case "3": return 23;
                    default: throw new Error(ErrorTable[12]);
                }
            }
            case 19: {
                switch (c) {
                    case "lf": return 25;
                    default: throw new Error(ErrorTable[13]);
                }
            }
            case 21: {
                switch (c) {
                    case "lf": return 25;
                    default: throw new Error(ErrorTable[13]);
                }
            }
            case 23: {
                switch (c) {
                    case "lf": return 25;
                    default: throw new Error(ErrorTable[13]);
                }
            }
            case 25: {
                switch (c) {
                    case "pc": return 26;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 26: {
                switch (c) {
                    case "es": return 27;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 27: {
                switch (c) {
                    case "en": return 28;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 28: {
                switch (c) {
                    case "en": return 28;
                    case "VL": return 15;
                    case "TI": return 33;
                    case "LC": return 50;
                    case "OFF": return 104;
                    default: throw new Error(ErrorTable[9]);
                }
            }
            case 33: {
                switch (c) {
                    case "ig": return 34;
                    default: throw new Error(ErrorTable[10]);
                }
            }
            case 34: {
                switch (c) {
                    case "li": return 35;
                    default: throw new Error(ErrorTable[11]);
                }
            }
            case 35: {
                switch (c) {
                    case "5": return 37;
                    case "10": return 39;
                    case "20": return 41;
                    default: throw new Error(ErrorTable[14]);
                }
            }
            case 37: {
                switch (c) {
                    case "lf": return 43;
                    default: throw new Error(ErrorTable[13]);
                }
            }
            case 39: {
                switch (c) {
                    case "lf": return 43;
                    default: throw new Error(ErrorTable[13]);
                }
            }
            case 41: {
                switch (c) {
                    case "lf": return 43;
                    default: throw new Error(ErrorTable[13]);
                }
            }
            case 43: {
                switch (c) {
                    case "pc": return 44;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 44: {
                switch (c) {
                    case "es": return 45;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 45: {
                switch (c) {
                    case "en": return 46;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 46: {
                switch (c) {
                    case "en": return 46;
                    case "LC": return 50;
                    default: throw new Error(ErrorTable[15]);
                }
            }
            case 50: {
                switch (c) {
                    case "pi": return 51;
                    default: throw new Error(ErrorTable[6]);
                }
            }
            case 51: {
                switch (c) {
                    case "1": return 53;
                    case "2": return 55;
                    case "3": return 57;
                    default: throw new Error(ErrorTable[12]);
                }
            }
            case 53: {
                switch (c) {
                    case "co": return 59;
                    default: throw new Error(ErrorTable[16]);
                }
            }
            case 55: {
                switch (c) {
                    case "co": return 59;
                    default: throw new Error(ErrorTable[16]);
                }
            }
            case 57: {
                switch (c) {
                    case "co": return 59;
                    default: throw new Error(ErrorTable[16]);
                }
            }
            case 59: {
                switch (c) {
                    case "5": return 61;
                    case "10": return 63;
                    case "20": return 65;
                    default: throw new Error(ErrorTable[14]);
                }
            }
            case 61: {
                switch (c) {
                    case "pf": return 67;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 63: {
                switch (c) {
                    case "pf": return 67;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 65: {
                switch (c) {
                    case "pf": return 67;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 67: {
                switch (c) {
                    case "pc": return 68;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 68: {
                switch (c) {
                    case "es": return 69;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 69: {
                switch (c) {
                    case "en": return 70;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 70: {
                switch (c) {
                    case "en": return 70;
                    case "ST": return 72;
                    case "PP": return 96;
                    default: throw new Error(ErrorTable[9]);
                }
            }
            case 72: {
                switch (c) {
                    case "pi": return 73;
                    default: throw new Error(ErrorTable[6]);
                }
            }
            case 73: {
                switch (c) {
                    case "1": return 75;
                    case "2": return 77;
                    case "3": return 79;
                    default: throw new Error(ErrorTable[12]); //STOP(pl)
                }
            }
            case 75: {
                switch (c) {
                    case "co": return 81;
                    default: throw new Error(ErrorTable[16]);
                }
            }
            case 77: {
                switch (c) {
                    case "co": return 81;
                    default: throw new Error(ErrorTable[16]);
                }
            }
            case 79: {
                switch (c) {
                    case "co": return 81;
                    default: throw new Error(ErrorTable[16]);
                }
            }
            case 81: {
                switch (c) {
                    case "5": return 83;
                    case "10": return 85;
                    case "20": return 87;
                    default: throw new Error(ErrorTable[14]);
                }
            }
            case 83: {
                switch (c) {
                    case "pf": return 89;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 85: {
                switch (c) {
                    case "pf": return 89;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 87: {
                switch (c) {
                    case "pf": return 89;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 89: {
                switch (c) {
                    case "pc": return 90;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 90: {
                switch (c) {
                    case "es": return 91;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 91: {
                switch (c) {
                    case "en": return 92;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 92: {
                switch (c) {
                    case "en": return 92;
                    case "PP": return 96;
                    default: throw new Error(ErrorTable[5]);
                }
            }
            case 96: {
                switch (c) {
                    case "pi": return 97;
                    default: throw new Error(ErrorTable[6]);
                }
            }
            case 97: {
                switch (c) {
                    case "pl": return 98;
                    default: throw new Error(ErrorTable[7]);
                }
            }
            case 98: {
                switch (c) {
                    case "pl": return 98;
                    case "pf": return 99;
                    default: throw new Error(ErrorTable[8]);
                }
            }
            case 99: {
                switch (c) {
                    case "pc": return 100;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 100: {
                switch (c) {
                    case "es": return 101;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 101: {
                switch (c) {
                    case "en": return 102;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 102: {
                switch (c) {
                    case "en": return 102;
                    case "VL": return 15;
                    case "TI": return 33;
                    case "LC": return 50;
                    case "OFF": return 104;
                }
            }
            case 104: {
                switch (c) {
                    case "pc": return 105;
                    default: throw new Error(ErrorTable[2]);
                }
            }
            case 105: {
                switch (c) {
                    case "es": return 106;
                    default: throw new Error(ErrorTable[3]);
                }
            }
            case 106: {
                switch (c) {
                    case "en": return 107;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            case 107: {
                switch (c) {
                    case "en": return 107;
                    default: throw new Error(ErrorTable[4]);
                }
            }
            default: throw new Error(ErrorTable[0] + s);
        }
    }

    /**
     * Reset the current state to the start place
     */
    public void reset() {
        state = 1;
    }

    /**
     * 
     * Make one transition on each char in the given string.
     * @param in the string to use
     */
    public void process(String[] ptokens) {
        // String[] ptokens = in.split("-");
        for(int i=0;i<ptokens.length;i++) {
            String c = ptokens[i];
            state = delta(state, c);
            // System.out.println(ptokens[i]);
        }
        // for (int i = 0; i < in.length(); i++) {
        //     char c = in.charAt(i);
        //     state = delta(state, c);
        // }
    }

    /**
     * Comprueba si el automata termina en un estado permitido
     */
    public boolean accepted() {
        return state==107;
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new Error("Uso: java DFA archivo");
        }
        String filename = args[0];
        // String filename = "ejemplo1";

        DFA m = new DFA();
        System.out.println("Iniciando el analisis...");
        m.reset();
        m.process(Parser.tokenize(Parser.parseFile(filename)));
        if(m.accepted()) {
            System.out.println("Ok");
        }
        else System.out.print("NOT Ok");
        System.out.println("----------------------------------------------------");
        System.out.println("Analisis finalizado. Sintaxis valida.");
    }
    static class Parser {
        /**
         * Lee un fichero y concatena su contenido
         * @param filename nombre del archivo
         * @return cadena con todo el contenido del archivo
         */
        public static String parseFile(String filename) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line;
                String all = "";
                try {
                    while ((line = br.readLine()) != null) {
                        all += line + "\n";
                    }
                    br.close();
                    System.out.println("----------------------------------------------------");
                    System.out.println("Contenido del archivo: \n" +all);
                    return all;
                } catch (IOException e) {
                    throw new Error("Error en la lectura:" + e.getMessage());
                }
            } catch (FileNotFoundException e) {
                throw new Error("Archivo no especificado correctamente o no existe: " + filename);
            }
        }
        /**
         * Transforma el codigo que el usuario escribe en su programa a un lenguaje que entienda el automata.
         * 
         * Antes:
         * ENCENDER; 
            PARPADEAR(pl);
            APAGAR;
         * Ahora: ON-pc-es-en-PP-pi-pl-pf-pc-es-en-OFF-pc-es-en-
         * 
         * @param in Cadena del contenido del archivo
         * @return Arreglo con n tokens [ON,pc,es,en,PP,pi,pl,pf,pc,es,en,OFF,pc,es,en,]
         */
        public static String[] tokenize(String in) {
            String simplify = in.replaceAll("ENCENDER", "ON-").replaceAll("PARPADEAR_LED", "PP-").replaceAll("PARPADEAR", "PP-")
            .replaceAll("\n", "en-")
            .replaceAll("[\\(]", "pi-").replaceAll("[\\)]", "pf-").replaceAll("pl", "pl-")
            .replaceAll(";", "pc-").replaceAll(",", "co-").replaceAll("=", "ig-").replaceAll("[\\{]", "li-")
            .replaceAll("[\\}]", "lf-").replaceAll(" ", "es-").replaceAll("VEL", "VL-")
            .replaceAll("TIME_S", "TI-").replaceAll("LICUAR", "LC-").replaceAll("STOP", "ST-")
            .replaceAll("APAGAR", "OFF-").replaceAll("[0-9]+", "$0-");

            System.out.println("----------------------------------------------------");
            System.out.println("Cadena de tokens generada: " + simplify);
            return simplify.split("-");
        }
    }
}

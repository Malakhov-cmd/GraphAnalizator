import java.util.ArrayList;
import java.util.List;

public class Graph {
    public static void main(String[] args) {

    }

    enum States {
        E, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
        A11, A12, A13, A14, A15, A16, A17, A18, A19, A20,
        A21, A22, A23, A24, A25, A26, A27, A28, A29, A30,
        A31, A32, A33, A34, A35, A36, A37, A38, A39, A40,
        A41, A42, A43, A44, A45, A46, A47, A48, A49, A50,
        A51, A52, A53, A54, A55, A56, A57, A58, A59, A60,
        A61, A62, A63, A64, A65, A66, A67, B1, B2, A68, A69, A70,
        A71, A72, A73, A74, A75, A76, A77, A78, A79, A80,
        A81, A82, A83, A84, A85, A86, A87, A88, A89, A90,
        A91, A92, A93, A94, A95, A96, A97, A98, A99, A100,
        A101, A102, A103, A104, A105, A106, A107, A108, A109, A110,
        A111, A112, A113, B3, A114, A115, A116, A117, A118, A119, A120,
        A121, A122, A123, A124, A125, A126, A127, A128, A129, A130,
        A131, A132, A133, A134, A135, A136, A137, A138, A139, A140,
        A141, A142, A143, A144, A145, A146, A147, A148, A149, A150,
        A151, A152, A153, A154, A155, A156, A157, A158, B4, A159, A160,
        A161, A162, A163, A164, A165, A166, A167, A168, A169, A170,
        A171, A172, A173, A174, A175, A176, F
    }

    int mantisa_count;
    int num_symbol;
    int len;
    int start_ident;
    int start_const;
    int len_ident;
    int len_const;

    private String res;
    private String error;

    public String GetError() {
        return error;
    }

    public String GetResult() {
        return res;
    }

    public int GetNumber_of_current_symbol() {
        return num_symbol;
    }

    public List<String> IDENT;
    public List<String> CONST;

    public List<String> getIDENT() {
        return IDENT;
    }

    public void setIDENT(List<String> IDENT) {
        this.IDENT = IDENT;
    }

    public List<String> getCONST() {
        return CONST;
    }

    public void setCONST(List<String> CONST) {
        this.CONST = CONST;
    }

    public Graph() {
        IDENT = new ArrayList<>();
        CONST = new ArrayList<>();
        mantisa_count = 0;
        num_symbol = 0;
        len = 0;
        start_ident = 0;
        start_const = 0;
        len_ident = 0;
        len_const = 0;
    }

    public void testingString(String str) {
        str = str.toLowerCase();
        States state = States.A1;
        len = str.length();
        num_symbol = 0;
        error = null;

        while (state != States.F && state != States.E && num_symbol < len) {
            char current_symbol = str.charAt(num_symbol);
            num_symbol++;

            switch (state) {
                case A1 -> {
                    if (current_symbol == ' ') {
                        state = States.A1;
                    } else {
                        if (current_symbol == 'd') {
                            state = States.A2;
                        } else {
                            state = States.E;
                            error = "Waited space or \"d\"";
                        }
                    }
                }
                case A2 -> {
                    if (current_symbol == 'o') {
                        state = States.A3;
                    } else {
                        state = States.E;
                        error = "Waited  \"o\"";
                    }
                }
                case A3 -> {
                    if (current_symbol == 'u') {
                        state = States.A4;
                    } else {
                        state = States.E;
                        error = "Waited  \"u\"";
                    }
                }
                case A4 -> {
                    if (current_symbol == 'b') {
                        state = States.A5;
                    } else {
                        state = States.E;
                        error = "Waited  \"b\"";
                    }
                }
                case A5 -> {
                    if (current_symbol == 'l') {
                        state = States.A6;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A6 -> {
                    if (current_symbol == 'e') {
                        state = States.A7;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A7 -> {
                    if (current_symbol == ' ') {
                        state = States.A8;
                    } else {
                        state = States.E;
                        error = "Waited  space";
                    }
                }
                case A8 -> {
                    if (current_symbol == ' ') {
                        state = States.A8;
                    } else {
                        if (current_symbol == 'r') {
                            state = States.A9;
                        } else {
                            state = States.E;
                            error = "Waited space or \"r\"";
                        }
                    }
                }
                case A9 -> {
                    if (current_symbol == 'e') {
                        state = States.A10;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A10 -> {
                    if (current_symbol == 's') {
                        state = States.A11;
                    } else {
                        state = States.E;
                        error = "Waited  \"s\"";
                    }
                }
                case A11 -> {
                    if (current_symbol == 'u') {
                        state = States.A12;
                    } else {
                        state = States.E;
                        error = "Waited  \"u\"";
                    }
                }
                case A12 -> {
                    if (current_symbol == 'l') {
                        state = States.A13;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A13 -> {
                    if (current_symbol == 't') {
                        state = States.A14;
                    } else {
                        state = States.E;
                        error = "Waited  \"t\"";
                    }
                }
                case A14, A15 -> {
                    if (current_symbol == ' ') {
                        state = States.A15;
                    } else {
                        if (current_symbol == ';') {
                            state = States.A16;
                        } else {
                            state = States.E;
                            error = "Waited space or \";\"";
                        }
                    }
                }
                case A16 -> {
                    if (current_symbol == '\n') {
                        state = States.A17;
                    } else {
                        state = States.E;
                        error = "Waited  \"enter\"";
                    }
                }
                case A17, A18 -> {
                    if (current_symbol == ' ') {
                        state = States.A18;
                    } else {
                        if (current_symbol == 'd') {
                            state = States.A19;
                        } else {
                            state = States.E;
                            error = "Waited space or \"d\"";
                        }
                    }
                }
                case A19 -> {
                    if (current_symbol == 'o') {
                        state = States.A20;
                    } else {
                        state = States.E;
                        error = "Waited  \"o\"";
                    }
                }
                case A20 -> {
                    if (current_symbol == 'u') {
                        state = States.A21;
                    } else {
                        state = States.E;
                        error = "Waited  \"u\"";
                    }
                }
                case A21 -> {
                    if (current_symbol == 'b') {
                        state = States.A22;
                    } else {
                        state = States.E;
                        error = "Waited  \"t\"";
                    }
                }
                case A22 -> {
                    if (current_symbol == 'l') {
                        state = States.A23;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A23 -> {
                    if (current_symbol == 'e') {
                        state = States.A24;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A24 -> {
                    if (current_symbol == ' ') {
                        state = States.A25;
                    } else {
                        state = States.E;
                        error = "Waited  space";
                    }
                }
                case A25 -> {
                    if (current_symbol == ' ') {
                        state = States.A25;
                    } else {
                        if (current_symbol == 'o') {
                            state = States.A26;
                        } else {
                            state = States.E;
                            error = "Waited space or \"d\"";
                        }
                    }
                }
                case A26 -> {
                    if (current_symbol == 'p') {
                        state = States.A27;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A27 -> {
                    if (current_symbol == 'e') {
                        state = States.A28;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A28 -> {
                    if (current_symbol == 'r') {
                        state = States.A29;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A29 -> {
                    if (current_symbol == '1') {
                        state = States.A30;
                    } else {
                        state = States.E;
                        error = "Waited  \"1\"";
                    }
                }
                case A30, A31 -> {
                    if (current_symbol == ' ') {
                        state = States.A31;
                    } else {
                        if (current_symbol == '=') {
                            state = States.A32;
                        } else {
                            state = States.E;
                            error = "Waited space or \"=\"";
                        }
                    }
                }
                case A32, A33 -> {
                    if (current_symbol == ' ') {
                        state = States.A33;
                    } else {
                        if (current_symbol == '0') {
                            state = States.A34;
                        } else {
                            if (current_symbol == '-') {
                                state = States.A35;
                            } else {
                                if (Character.isDigit(current_symbol)) {
                                    state = States.A36;
                                } else {
                                    state = States.E;
                                    error = "Waited space or \"0\", \"-\" or another digits";
                                }
                            }
                        }
                    }
                }
                case A34 -> {
                    if (current_symbol == ' ') {
                        state = States.A40;
                    } else {
                        if (current_symbol == '.') {
                            state = States.A38;
                        } else {
                            if (current_symbol == ';') {
                                state = States.A41;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A36 -> {
                    if (current_symbol == ' ') {
                        state = States.A40;
                    } else {
                        if (current_symbol == '.') {
                            state = States.A38;
                        } else {
                            if (current_symbol == ';') {
                                state = States.A41;
                            } else {
                                if(Character.isDigit(current_symbol))
                                {
                                    state = States.A36;
                                } else {
                                    state = States.E;
                                    error = "Waited space or \".\", \";\"";
                                }
                            }
                        }
                    }
                }
                case A35 -> {
                    if (current_symbol == '0') {
                        state = States.A37;
                    } else {
                        if (Character.isDigit(current_symbol)) {
                            state = States.A36;
                        } else {
                            state = States.E;
                            error = "Waited  \"0\"";
                        }
                    }
                }
                case A37 -> {
                    if (current_symbol == '.') {
                        state = States.A38;
                    } else {
                        state = States.E;
                        error = "Waited  \".\"";
                    }
                }
                case A38 -> {
                    if (Character.isDigit(current_symbol)) {
                        state = States.A39;
                    } else {
                        state = States.E;
                        error = "Waited  0..9";
                    }
                }
                case A39 -> {
                    if (current_symbol == ' ') {
                        state = States.A40;
                    } else {
                        if (Character.isDigit(current_symbol)) {
                            state = States.A39;
                        } else {
                            if (current_symbol == ';') {
                                state = States.A41;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A40 -> {
                    if (current_symbol == ' ') {
                        state = States.A40;
                    } else {
                        if (current_symbol == ';') {
                            state = States.A41;
                        } else {
                            state = States.E;
                            error = "Waited  space or \";\"";
                        }
                    }
                }
                case A41, A42 -> {
                    if (current_symbol == ' ') {
                        state = States.A42;
                    } else {
                        if (current_symbol == '\n') {
                            state = States.A43;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"\n\"";
                        }
                    }
                }
                case A43, A44 -> {
                    if (current_symbol == ' ') {
                        state = States.A44;
                    } else {
                        if (current_symbol == 'd') {
                            state = States.A45;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"d\"";
                        }
                    }
                }
                case A45 -> {
                    if (current_symbol == 'o') {
                        state = States.A46;
                    } else {
                        state = States.E;
                        error = "Waited  \"o\"";
                    }
                }
                case A46 -> {
                    if (current_symbol == 'u') {
                        state = States.A47;
                    } else {
                        state = States.E;
                        error = "Waited  \"u\"";
                    }
                }
                case A47 -> {
                    if (current_symbol == 'b') {
                        state = States.A48;
                    } else {
                        state = States.E;
                        error = "Waited  \"b\"";
                    }
                }
                case A48 -> {
                    if (current_symbol == 'l') {
                        state = States.A49;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A49 -> {
                    if (current_symbol == 'e') {
                        state = States.A50;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A50 -> {
                    if (current_symbol == ' ') {
                        state = States.A51;
                    } else {
                        state = States.E;
                        error = "Waited  space";
                    }
                }
                case A51 -> {
                    if (current_symbol == ' ') {
                        state = States.A51;
                    } else {
                        if (current_symbol == 'o') {
                            state = States.A52;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"o\"";
                        }
                    }
                }
                case A52 -> {
                    if (current_symbol == 'p') {
                        state = States.A53;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A53 -> {
                    if (current_symbol == 'e') {
                        state = States.A54;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A54 -> {
                    if (current_symbol == 'r') {
                        state = States.A55;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A55 -> {
                    if (current_symbol == '2') {
                        state = States.A56;
                    } else {
                        state = States.E;
                        error = "Waited  \"2\"";
                    }
                }
                case A56, A57 -> {
                    if (current_symbol == ' ') {
                        state = States.A57;
                    } else {
                        if (current_symbol == '=') {
                            state = States.A58;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"=\"";
                        }
                    }
                }
                case A58, A59 -> {
                    if (current_symbol == ' ') {
                        state = States.A59;
                    } else {
                        if (current_symbol == '0') {
                            state = States.A60;
                        } else {
                            if (current_symbol == '-') {
                                state = States.A61;
                            } else {
                                if (Character.isDigit(current_symbol)) {
                                    state = States.A62;
                                } else {
                                    state = States.E;
                                    error = "Waited space or \"0\", \"-\" or another digits";
                                }
                            }
                        }
                    }
                }
                case A60-> {
                    if (current_symbol == ' ') {
                        state = States.A66;
                    } else {
                        if (current_symbol == '.') {
                            state = States.A64;
                        } else {
                            if (current_symbol == ';') {
                                state = States.A67;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A62 -> {
                    if (current_symbol == ' ') {
                        state = States.A66;
                    } else {
                        if (current_symbol == '.') {
                            state = States.A64;
                        } else {
                            if (current_symbol == ';') {
                                state = States.A67;
                            } else {
                                if(Character.isDigit(current_symbol))
                                {
                                    state = States.A62;
                                } else {
                                    state = States.E;
                                    error = "Waited space or \".\", \";\"";
                                }
                            }
                        }
                    }
                }
                case A61 -> {
                    if (current_symbol == '0') {
                        state = States.A63;
                    } else {
                        if (Character.isDigit(current_symbol)) {
                            state = States.A62;
                        } else {
                            state = States.E;
                            error = "Waited  \"0\" or another digits";
                        }
                    }
                }
                case A63 -> {
                    if (current_symbol == '.') {
                        state = States.A64;
                    } else {
                        state = States.E;
                        error = "Waited  \".\"";
                    }
                }
                case A64 -> {
                    if (Character.isDigit(current_symbol)) {
                        state = States.A65;
                    } else {
                        state = States.E;
                        error = "Waited  0..9";
                    }
                }
                case A65 -> {
                    if (current_symbol == ' ') {
                        state = States.A66;
                    } else {
                        if (Character.isDigit(current_symbol)) {
                            state = States.A65;
                        } else {
                            if (current_symbol == ';') {
                                state = States.A67;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A66 -> {
                    if (current_symbol == ' ') {
                        state = States.A66;
                    } else {
                        if (current_symbol == ';') {
                            state = States.A67;
                        } else {
                            state = States.E;
                            error = "Waited  space or \";\"";
                        }
                    }
                }
                case A67, B1 -> {
                    if (current_symbol == ' ') {
                        state = States.B1;
                    } else {
                        if (current_symbol == '\n') {
                            state = States.B2;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"\n\"";
                        }
                    }
                }
                case B2, A68 -> {
                    if (current_symbol == ' ') {
                        state = States.A68;
                    } else {
                        if (current_symbol == 'i') {
                            state = States.A69;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"i\"";
                        }
                    }
                }
                case A69 -> {
                    if (current_symbol == 'f') {
                        state = States.A70;
                    } else {
                        state = States.E;
                        error = "Waited  \"f\"";
                    }
                }
                case A70, A71 -> {
                    if (current_symbol == ' ') {
                        state = States.A71;
                    } else {
                        if (current_symbol == '(') {
                            state = States.A72;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"(\"";
                        }
                    }
                }
                case A72, A73 -> {
                    if (current_symbol == ' ') {
                        state = States.A73;
                    } else {
                        if (current_symbol == 'o') {
                            state = States.A74;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"o\"";
                        }
                    }
                }
                case A74 -> {
                    if (current_symbol == 'p') {
                        state = States.A75;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A75 -> {
                    if (current_symbol == 'e') {
                        state = States.A76;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A76 -> {
                    if (current_symbol == 'r') {
                        state = States.A77;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A77 -> {
                    if (current_symbol == '1') {
                        state = States.A78;
                    } else {
                        state = States.E;
                        error = "Waited  \"1\"";
                    }
                }
                case A78, A79 -> {
                    if (current_symbol == ' ') {
                        state = States.A79;
                    } else {
                        if (current_symbol == '<') {
                            state = States.A80;
                        } else {
                            if (current_symbol == '>') {
                                state = States.A81;
                            } else {
                                if (current_symbol == '=') {
                                    state = States.A82;
                                } else {
                                    if (current_symbol == '!') {
                                        state = States.A83;
                                    } else {
                                        state = States.E;
                                        error = "Waited  \"p\"";
                                    }
                                }
                            }
                        }
                    }
                }
                case A80, A81 -> {
                    if (current_symbol == '=') {
                        state = States.A82;
                    } else {
                        if (current_symbol == ' ') {
                            state = States.A84;
                        } else {
                            if (current_symbol == 'o') {
                                state = States.A85;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A82, A84 -> {
                    if (current_symbol == ' ') {
                        state = States.A84;
                    } else {
                        if (current_symbol == 'o') {
                            state = States.A85;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"o\"";
                        }
                    }
                }
                case A83 -> {
                    if (current_symbol == '=') {
                        state = States.A82;
                    } else {
                        state = States.E;
                        error = "Waited  \"=\"";
                    }
                }
                case A85 -> {
                    if (current_symbol == 'p') {
                        state = States.A86;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A86 -> {
                    if (current_symbol == 'e') {
                        state = States.A87;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A87 -> {
                    if (current_symbol == 'r') {
                        state = States.A88;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A88 -> {
                    if (current_symbol == '2') {
                        state = States.A89;
                    } else {
                        state = States.E;
                        error = "Waited  \"1\"";
                    }
                }
                case A89, A90 -> {
                    if (current_symbol == ' ') {
                        state = States.A90;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A91;
                        } else {
                            state = States.E;
                            error = "Waited  space or \")\"";
                        }
                    }
                }
                case A91, A92 -> {
                    if (current_symbol == ' ') {
                        state = States.A92;
                    } else {
                        if (current_symbol == '\n') {
                            state = States.A93;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"\n\"";
                        }
                    }
                }
                case A93, A94 -> {
                    if (current_symbol == ' ') {
                        state = States.A94;
                    } else {
                        if (current_symbol == '{') {
                            state = States.A95;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"\\{\"";
                        }
                    }
                }
                case A95, A96 -> {
                    if (current_symbol == ' ') {
                        state = States.A96;
                    } else {
                        if (current_symbol == 'r') {
                            state = States.A97;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"r\"";
                        }
                    }
                }
                case A97 -> {
                    if (current_symbol == 'e') {
                        state = States.A98;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A98 -> {
                    if (current_symbol == 's') {
                        state = States.A99;
                    } else {
                        state = States.E;
                        error = "Waited  \"s\"";
                    }
                }
                case A99 -> {
                    if (current_symbol == 'u') {
                        state = States.A100;
                    } else {
                        state = States.E;
                        error = "Waited  \"u\"";
                    }
                }
                case A100 -> {
                    if (current_symbol == 'l') {
                        state = States.A101;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A101 -> {
                    if (current_symbol == 't') {
                        state = States.A102;
                    } else {
                        state = States.E;
                        error = "Waited  \"t\"";
                    }
                }
                case A102, A103 -> {
                    if (current_symbol == ' ') {
                        state = States.A103;
                    } else {
                        if (current_symbol == '=') {
                            state = States.A104;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"=\"";
                        }
                    }
                }
                case A104, A105 -> {
                    if (current_symbol == ' ') {
                        state = States.A105;
                    } else {
                        if (current_symbol == 'm') {
                            state = States.A106;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"m\"";
                        }
                    }
                }
                case A106 -> {
                    if (current_symbol == 'a') {
                        state = States.A107;
                    } else {
                        state = States.E;
                        error = "Waited  \"a\"";
                    }
                }
                case A107 -> {
                    if (current_symbol == 't') {
                        state = States.A108;
                    } else {
                        state = States.E;
                        error = "Waited  \"t\"";
                    }
                }
                case A108 -> {
                    if (current_symbol == 'h') {
                        state = States.A109;
                    } else {
                        state = States.E;
                        error = "Waited  \"h\"";
                    }
                }
                case A109 -> {
                    if (current_symbol == '.') {
                        state = States.A110;
                    } else {
                        state = States.E;
                        error = "Waited  \".\"";
                    }
                }
                case A110 -> {
                    if (current_symbol == 'p') {
                        state = States.A111;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A111 -> {
                    if (current_symbol == 'o') {
                        state = States.A112;
                    } else {
                        state = States.E;
                        error = "Waited  \"o\"";
                    }
                }
                case A112 -> {
                    if (current_symbol == 'w') {
                        state = States.A113;
                    } else {
                        state = States.E;
                        error = "Waited  \"w\"";
                    }
                }
                case A113, B3 -> {
                    if (current_symbol == ' ') {
                        state = States.B3;
                    } else {
                        if (current_symbol == '(') {
                            state = States.A114;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"(\"";
                        }
                    }
                }
                case A114 -> {
                    if (current_symbol == 'o') {
                        state = States.A115;
                    } else {
                        state = States.E;
                        error = "Waited  \"o\"";
                    }
                }
                case A115 -> {
                    if (current_symbol == 'p') {
                        state = States.A116;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A116 -> {
                    if (current_symbol == 'e') {
                        state = States.A117;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A117 -> {
                    if (current_symbol == 'r') {
                        state = States.A118;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A118 -> {
                    if (current_symbol == '1') {
                        state = States.A119;
                    } else {
                        state = States.E;
                        error = "Waited  \"1\"";
                    }
                }
                case A119, A120 -> {
                    if (current_symbol == ' ') {
                        state = States.A120;
                    } else {
                        if (current_symbol == ',') {
                            state = States.A121;
                        } else {
                            state = States.E;
                            error = "Waited  space or \",\"";
                        }
                    }
                }
                case A121, A122 -> {
                    if (current_symbol == ' ') {
                        state = States.A122;
                    } else {
                        if (Character.isDigit(current_symbol)) {
                            state = States.A123;
                        } else {
                            state = States.E;
                            error = "Waited  space or 0..9";
                        }
                    }
                }
                case A123 -> {
                    if (current_symbol == ' ') {
                        state = States.A126;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A127;
                        } else {
                            if (Character.isDigit(current_symbol)) {
                                state = States.A124;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A124 -> {
                    if (current_symbol == ' ') {
                        state = States.A126;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A127;
                        } else {
                            if (Character.isDigit(current_symbol)) {
                                state = States.A125;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\")or another digit";
                            }
                        }
                    }
                }
                case A125, A126 -> {
                    if (current_symbol == ' ') {
                        state = States.A126;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A127;
                        } else {
                            state = States.E;
                            error = "Waited  space or ). Max digit count value is 3";
                        }
                    }
                }
                case A127, A128 -> {
                    if (current_symbol == ' ') {
                        state = States.A128;
                    } else {
                        if (current_symbol == ';') {
                            state = States.A129;
                        } else {
                            state = States.E;
                            error = "Waited space or \";\")";
                        }
                    }
                }
                case A129, A130 -> {
                    if (current_symbol == ' ') {
                        state = States.A130;
                    } else {
                        if (current_symbol == '\n') {
                            state = States.A131;
                        } else {
                            state = States.E;
                            error = "Waited space or \"\\n\")";
                        }
                    }
                }
                case A131, A132 -> {
                    if (current_symbol == ' ') {
                        state = States.A132;
                    } else {
                        if (current_symbol == '}') {
                            state = States.A133;
                        } else {
                            state = States.E;
                            error = "Waited space or \"\\}\")";
                        }
                    }
                }
                case A133, A134 -> {
                    if (current_symbol == ' ') {
                        state = States.A134;
                    } else {
                        if (current_symbol == 'e') {
                            state = States.A135;
                        } else {
                            if (current_symbol == '\n') {
                                state = States.F;
                            } else {
                                state = States.E;
                                error = "Waited space or \"e\")or enter";
                            }
                        }
                    }
                }
                case A135 -> {
                    if (current_symbol == 'l') {
                        state = States.A136;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A136 -> {
                    if (current_symbol == 's') {
                        state = States.A137;
                    } else {
                        state = States.E;
                        error = "Waited  \"s\"";
                    }
                }
                case A137 -> {
                    if (current_symbol == 'e') {
                        state = States.A138;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A138, A139 -> {
                    if (current_symbol == ' ') {
                        state = States.A139;
                    } else {
                        if (current_symbol == '{') {
                            state = States.A140;
                        } else {
                            state = States.E;
                            error = "Waited space or \"\\{\")";
                        }
                    }
                }
                case A140, A141 -> {
                    if (current_symbol == ' ') {
                        state = States.A141;
                    } else {
                        if (current_symbol == 'r') {
                            state = States.A142;
                        } else {
                            state = States.E;
                            error = "Waited space or \"\\r\")";
                        }
                    }
                }
                case A142 -> {
                    if (current_symbol == 'e') {
                        state = States.A143;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A143 -> {
                    if (current_symbol == 's') {
                        state = States.A144;
                    } else {
                        state = States.E;
                        error = "Waited  \"s\"";
                    }
                }
                case A144 -> {
                    if (current_symbol == 'u') {
                        state = States.A145;
                    } else {
                        state = States.E;
                        error = "Waited  \"u\"";
                    }
                }
                case A145 -> {
                    if (current_symbol == 'l') {
                        state = States.A146;
                    } else {
                        state = States.E;
                        error = "Waited  \"l\"";
                    }
                }
                case A146 -> {
                    if (current_symbol == 't') {
                        state = States.A147;
                    } else {
                        state = States.E;
                        error = "Waited  \"t\"";
                    }
                }
                case A147, A148 -> {
                    if (current_symbol == ' ') {
                        state = States.A148;
                    } else {
                        if (current_symbol == '=') {
                            state = States.A149;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"=\"";
                        }
                    }
                }
                case A149, A150 -> {
                    if (current_symbol == ' ') {
                        state = States.A150;
                    } else {
                        if (current_symbol == 'm') {
                            state = States.A151;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"m\"";
                        }
                    }
                }
                case A151 -> {
                    if (current_symbol == 'a') {
                        state = States.A152;
                    } else {
                        state = States.E;
                        error = "Waited  \"a\"";
                    }
                }
                case A152 -> {
                    if (current_symbol == 't') {
                        state = States.A153;
                    } else {
                        state = States.E;
                        error = "Waited  \"t\"";
                    }
                }
                case A153 -> {
                    if (current_symbol == 'h') {
                        state = States.A154;
                    } else {
                        state = States.E;
                        error = "Waited  \"h\"";
                    }
                }
                case A154 -> {
                    if (current_symbol == '.') {
                        state = States.A155;
                    } else {
                        state = States.E;
                        error = "Waited  \".\"";
                    }
                }
                case A155 -> {
                    if (current_symbol == 'p') {
                        state = States.A156;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A156 -> {
                    if (current_symbol == 'o') {
                        state = States.A157;
                    } else {
                        state = States.E;
                        error = "Waited  \"o\"";
                    }
                }
                case A157 -> {
                    if (current_symbol == 'w') {
                        state = States.A158;
                    } else {
                        state = States.E;
                        error = "Waited  \"w\"";
                    }
                }
                case A158, B4 -> {
                    if (current_symbol == ' ') {
                        state = States.B4;
                    } else {
                        if (current_symbol == '(') {
                            state = States.A159;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"(\"";
                        }
                    }
                }
                case A159, A160 -> {
                    if (current_symbol == ' ') {
                        state = States.A160;
                    } else {
                        if (current_symbol == 'o') {
                            state = States.A161;
                        } else {
                            state = States.E;
                            error = "Waited  space or \"o\"";
                        }
                    }
                }
                case A161 -> {
                    if (current_symbol == 'p') {
                        state = States.A162;
                    } else {
                        state = States.E;
                        error = "Waited  \"p\"";
                    }
                }
                case A162 -> {
                    if (current_symbol == 'e') {
                        state = States.A163;
                    } else {
                        state = States.E;
                        error = "Waited  \"e\"";
                    }
                }
                case A163 -> {
                    if (current_symbol == 'r') {
                        state = States.A164;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A164 -> {
                    if (current_symbol == '2') {
                        state = States.A165;
                    } else {
                        state = States.E;
                        error = "Waited  \"r\"";
                    }
                }
                case A165, A166 -> {
                    if (current_symbol == ' ') {
                        state = States.A166;
                    } else {
                        if (current_symbol == ',') {
                            state = States.A167;
                        } else {
                            state = States.E;
                            error = "Waited  space or \",\"";
                        }
                    }
                }
                case A167, A168 -> {
                    if (current_symbol == ' ') {
                        state = States.A168;
                    } else {
                        if (Character.isDigit(current_symbol)) {
                            state = States.A169;
                        } else {
                            state = States.E;
                            error = "Waited  space or 0..9";
                        }
                    }
                }
                case A169 -> {
                    if (current_symbol == ' ') {
                        state = States.A172;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A173;
                        } else {
                            if (Character.isDigit(current_symbol)) {
                                state = States.A170;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\", \";\"";
                            }
                        }
                    }
                }
                case A170 -> {
                    if (current_symbol == ' ') {
                        state = States.A172;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A173;
                        } else {
                            if (Character.isDigit(current_symbol)) {
                                state = States.A171;
                            } else {
                                state = States.E;
                                error = "Waited space or \".\")or another digit";
                            }
                        }
                    }
                }
                case A171, A172 -> {
                    if (current_symbol == ' ') {
                        state = States.A172;
                    } else {
                        if (current_symbol == ')') {
                            state = States.A173;
                        } else {
                            state = States.E;
                            error = "Waited  space or ). Max digit count value is 3";
                        }
                    }
                }
                case A173, A174 -> {
                    if (current_symbol == ' ') {
                        state = States.A174;
                    } else {
                        if (current_symbol == ';') {
                            state = States.A175;
                        } else {
                            state = States.E;
                            error = "Waited  space or \";\"";
                        }
                    }
                }
                case A175, A176 -> {
                    if (current_symbol == ' ') {
                        state = States.A176;
                    } else {
                        if (current_symbol == '}') {
                            state = States.F;
                        } else {
                            state = States.E;
                            error = "Waited  space or \";\"";
                        }
                    }
                }
            }
            if(state == States.F)
            {
                res = "Success";
            }
            else {
                res = " ";
            }
        }
        if(state != States.E && state != States.F)
        {
            state = States.E;
            error = "Error! It is not full sequence";
        }
    }
}

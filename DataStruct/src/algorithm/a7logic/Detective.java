package algorithm.a7logic;

/**
 * 某地刑侦大队对涉及6个嫌疑人的一桩嫌疑案进行分析：
 * A、B至少有1人作案
 * A、E、F 3人中至少有2人参与作案
 * A、D不可能是同案犯
 * B、C或同时作案，或与本案无关
 * C、D中有且仅有1人作案
 * 如果D没有参与作案，则E也不可能参与作案
 * 试分析出作案人员是谁？
 */
public class Detective {
    //T1=A|B;
    //T2=(A&E)|(A&F)|(E&F);
    //T3=~(A&D);
    //T4=(B&C)|(~B&~C);
    //T5=C^D;
    //T6=D|(~D&~E);
    public static void main(String[] args) {
        int A, B, C, D, E, F;
        int T1, T2, T3, T4, T5, T6;

        for (A = 0; A < 2; A++) {
            for (B = 0; B < 2; B++) {
                for (C = 0; C < 2; C++) {
                    for (D = 0; D < 2; D++) {
                        for (E = 0; E < 2; E++) {
                            for (F = 0; F < 2; F++) {
                                T1 = A | B;
                                T2 = (A & E) | (A & F) | (E & F);
                                T3 = ~(A & D);
                                T4 = (B & C) | (~B & ~C);
                                T5 = C ^ D;
                                T6 = D | (~D & ~E);
                                int T = T1 & T2 & T3 & T4 & T5 & T6;
                                if (T == 1) System.out.printf("%d%d%d%d%d%d", A, B, C, D, E, F);
                            }
                        }
                    }
                }
            }
        }

    }
}

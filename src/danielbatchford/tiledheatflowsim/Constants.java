package danielbatchford.tiledheatflowsim;

interface Constants {

    int WIDTH = 1000;
    int HEIGHT = 1000;
    int[] DIVS = new int[]{100, 100};
    int FRAME_RATE = 60;

    String WINDOW_TITLE = "2D Tiled Heat Flow Simulation";

    int[] BLOCK_COL = new int[]{0,0,0};

    int MAX_TEMP = 255;

    int[][] HEAT_MAP = { {255,255,195}, {255,255,194}, {255,255,193}, {255,255,191}, {255,255,190}, {255,255,189},
            {255,255,188}, {255,255,187}, {255,255,186}, {255,255,185}, {255,255,184}, {255,255,183}, {255,255,182},
            {255,255,181}, {255,255,179}, {255,255,178}, {255,255,177}, {255,255,176}, {255,255,175}, {255,255,174},
            {255,255,173}, {255,255,172}, {255,255,171}, {255,255,170}, {255,255,169}, {255,255,167}, {255,255,166},
            {255,255,165}, {255,255,164}, {255,255,163}, {255,255,162}, {255,255,161}, {255,255,160}, {255,255,159},
            {255,255,158}, {255,255,157}, {255,255,155}, {255,255,154}, {255,255,153}, {255,255,152}, {255,255,151},
            {255,255,150}, {255,255,149}, {255,255,148}, {255,255,147}, {255,255,146}, {255,255,145}, {255,255,143},
            {255,255,142}, {255,255,141}, {255,255,140}, {255,255,139}, {255,255,138}, {255,255,137}, {255,255,136},
            {255,255,135}, {255,255,134}, {255,255,133}, {255,255,131}, {255,255,130}, {255,255,129}, {255,255,128},
            {255,255,127}, {255,255,126}, {255,255,125}, {255,253,125}, {255,251,125}, {255,249,125}, {255,247,125},
            {255,245,125}, {255,242,125}, {255,241,125}, {255,238,125}, {255,237,125}, {255,235,125}, {255,233,125},
            {255,231,125}, {255,229,126}, {255,227,126}, {255,225,126}, {255,223,126}, {255,221,126}, {255,219,126},
            {255,217,126}, {255,215,126}, {255,213,126}, {255,211,126}, {255,209,126}, {255,207,126}, {255,205,126},
            {255,203,126}, {255,201,126}, {255,199,126}, {255,197,126}, {255,195,126}, {255,193,126}, {255,191,126},
            {255,189,126}, {255,187,126}, {255,185,126}, {255,183,126}, {255,181,126}, {255,179,126}, {255,177,126},
            {255,175,126}, {255,173,126}, {255,171,126}, {255,169,126}, {255,167,126}, {255,165,126}, {255,163,126},
            {255,161,126}, {255,159,126}, {255,157,126}, {255,155,126}, {255,153,126}, {255,151,126}, {255,149,126},
            {255,147,126}, {255,145,127}, {255,143,127}, {255,141,127}, {255,138,127}, {255,136,127}, {255,134,127},
            {255,132,127}, {255,131,127}, {255,129,127}, {254,126,127}, {252,125,127}, {250,122,127}, {248,121,127},
            {246,118,127}, {244,116,127}, {242,115,127}, {240,113,127}, {238,111,127}, {236,109,127}, {234,107,127},
            {232,105,127}, {230,102,127}, {228,100,127}, {226,98,127}, {224,97,127}, {222,94,127}, {220,93,127},
            {218,91,127}, {216,89,127}, {214,87,127}, {212,84,127}, {210,83,127}, {208,81,127}, {206,79,127},
            {204,77,127}, {202,75,127}, {200,73,127}, {198,70,127}, {196,68,127}, {194,66,127}, {192,64,127},
            {190,63,127}, {188,61,127}, {186,59,127}, {184,57,127}, {182,54,127}, {180,52,127}, {178,51,127},
            {176,49,127}, {174,47,127}, {171,44,127}, {169,42,127}, {167,40,127}, {165,39,127}, {163,37,127},
            {161,34,127}, {159,33,127}, {157,31,127}, {155,29,127}, {153,27,127}, {151,25,127}, {149,22,127},
            {147,20,127}, {145,18,127}, {143,17,127}, {141,14,127}, {139,13,127}, {137,11,127}, {135,9,127},
            {133,6,127}, {131,4,127}, {129,2,127}, {127,0,127}, {125,0,127}, {123,0,127}, {121,0,127}, {119,0,127},
            {117,0,127}, {115,0,127}, {113,0,127}, {111,0,127}, {109,0,127}, {107,0,127}, {105,0,127}, {103,0,127},
            {101,0,127}, {99,0,127}, {97,0,127}, {95,0,127}, {93,0,127}, {91,0,127}, {89,0,127}, {87,0,126},
            {85,0,126}, {83,0,126}, {82,0,126}, {80,0,126}, {78,0,126}, {76,0,126}, {74,0,126}, {72,0,126},
            {70,0,126}, {68,0,126}, {66,0,126}, {64,0,126}, {62,0,126}, {60,0,126}, {58,0,126}, {56,0,126},
            {54,0,126}, {52,0,126}, {50,0,126}, {48,0,126}, {46,0,126}, {44,0,126}, {42,0,126}, {40,0,126},
            {38,0,126}, {36,0,126}, {34,0,126}, {32,0,126}, {30,0,126}, {28,0,126}, {26,0,126}, {24,0,126},
            {22,0,126}, {20,0,126}, {18,0,126}, {16,0,126}, {14,0,126}, {12,0,126}, {10,0,126}, {8,0,126},
            {6,0,126}, {4,0,126}, {2,0,126}, {0,0,126} };
}

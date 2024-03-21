package main;

import object.Obj_chest;
import object.Obj_door;
import object.Obj_doorOpen;
import object.Obj_key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new Obj_key();
        gp.obj[0].worldX = 38 * gp.tileSize;
        gp.obj[0].worldY = 25 * gp.tileSize;

        gp.obj[2] = new Obj_doorOpen();
        gp.obj[2].worldX = 4 * gp.tileSize;
        gp.obj[2].worldY = 6 * gp.tileSize;

        gp.obj[3] = new Obj_door();
        gp.obj[3].worldX = 4 * gp.tileSize;
        gp.obj[3].worldY = 6 * gp.tileSize;

        gp.obj[4] = new Obj_doorOpen();
        gp.obj[4].worldX = 10 * gp.tileSize;
        gp.obj[4].worldY = 6 * gp.tileSize;

        gp.obj[5] = new Obj_door();
        gp.obj[5].worldX = 10 * gp.tileSize;
        gp.obj[5].worldY = 6 * gp.tileSize;

        gp.obj[6] = new Obj_doorOpen();
        gp.obj[6].worldX = 18 * gp.tileSize;
        gp.obj[6].worldY = 6 * gp.tileSize;

        gp.obj[7] = new Obj_door();
        gp.obj[7].worldX = 18 * gp.tileSize;
        gp.obj[7].worldY = 6 * gp.tileSize;

        gp.obj[8] = new Obj_doorOpen();
        gp.obj[8].worldX = 26 * gp.tileSize;
        gp.obj[8].worldY = 6 * gp.tileSize;

        gp.obj[9] = new Obj_door();
        gp.obj[9].worldX = 26 * gp.tileSize;
        gp.obj[9].worldY = 6 * gp.tileSize;

        gp.obj[10] = new Obj_doorOpen();
        gp.obj[10].worldX = 34 * gp.tileSize;
        gp.obj[10].worldY = 6 * gp.tileSize;

        gp.obj[11] = new Obj_door();
        gp.obj[11].worldX = 34 * gp.tileSize;
        gp.obj[11].worldY = 6 * gp.tileSize;

        gp.obj[12] = new Obj_doorOpen();
        gp.obj[12].worldX = 40 * gp.tileSize;
        gp.obj[12].worldY = 6 * gp.tileSize;

        gp.obj[13] = new Obj_door();
        gp.obj[13].worldX = 40 * gp.tileSize;
        gp.obj[13].worldY = 6 * gp.tileSize;

        //2n Fila de puertas
        gp.obj[14] = new Obj_doorOpen();
        gp.obj[14].worldX = 30 * gp.tileSize;
        gp.obj[14].worldY = 10 * gp.tileSize;

        gp.obj[15] = new Obj_door();
        gp.obj[15].worldX = 30 * gp.tileSize;
        gp.obj[15].worldY = 10 * gp.tileSize;

        gp.obj[16] = new Obj_doorOpen();
        gp.obj[16].worldX = 22 * gp.tileSize;
        gp.obj[16].worldY = 10 * gp.tileSize;

        gp.obj[17] = new Obj_door();
        gp.obj[17].worldX = 22 * gp.tileSize;
        gp.obj[17].worldY = 10 * gp.tileSize;

        gp.obj[18] = new Obj_doorOpen();
        gp.obj[18].worldX = 14 * gp.tileSize;
        gp.obj[18].worldY = 10 * gp.tileSize;

        gp.obj[19] = new Obj_door();
        gp.obj[19].worldX = 14 * gp.tileSize;
        gp.obj[19].worldY = 10 * gp.tileSize;

        gp.obj[20] = new Obj_doorOpen();
        gp.obj[20].worldX = 6 * gp.tileSize;
        gp.obj[20].worldY = 10 * gp.tileSize;

        gp.obj[21] = new Obj_door();
        gp.obj[21].worldX = 6 * gp.tileSize;
        gp.obj[21].worldY = 10 * gp.tileSize;

        gp.obj[22] = new Obj_doorOpen();
        gp.obj[22].worldX = 38 * gp.tileSize;
        gp.obj[22].worldY = 10 * gp.tileSize;

        gp.obj[23] = new Obj_door();
        gp.obj[23].worldX = 38 * gp.tileSize;
        gp.obj[23].worldY = 10 * gp.tileSize;

        //Primera fila de puertas
        gp.obj[24] = new Obj_doorOpen();
        gp.obj[24].worldX = 30 * gp.tileSize;
        gp.obj[24].worldY = 4 * gp.tileSize;

        gp.obj[25] = new Obj_door();
        gp.obj[25].worldX = 30 * gp.tileSize;
        gp.obj[25].worldY = 4 * gp.tileSize;

        gp.obj[26] = new Obj_doorOpen();
        gp.obj[26].worldX = 22 * gp.tileSize;
        gp.obj[26].worldY = 4 * gp.tileSize;

        gp.obj[27] = new Obj_door();
        gp.obj[27].worldX = 22 * gp.tileSize;
        gp.obj[27].worldY = 4 * gp.tileSize;

        gp.obj[28] = new Obj_doorOpen();
        gp.obj[28].worldX = 14 * gp.tileSize;
        gp.obj[28].worldY = 4 * gp.tileSize;

        gp.obj[29] = new Obj_door();
        gp.obj[29].worldX = 14 * gp.tileSize;
        gp.obj[29].worldY = 4 * gp.tileSize;

        gp.obj[30] = new Obj_doorOpen();
        gp.obj[30].worldX = 6 * gp.tileSize;
        gp.obj[30].worldY = 4 * gp.tileSize;

        gp.obj[31] = new Obj_door();
        gp.obj[31].worldX = 6 * gp.tileSize;
        gp.obj[31].worldY = 4 * gp.tileSize;

        gp.obj[32] = new Obj_doorOpen();
        gp.obj[32].worldX = 38 * gp.tileSize;
        gp.obj[32].worldY = 4 * gp.tileSize;

        gp.obj[33] = new Obj_door();
        gp.obj[33].worldX = 38 * gp.tileSize;
        gp.obj[33].worldY = 4 * gp.tileSize;

        //fila 2
        gp.obj[34] = new Obj_doorOpen();
        gp.obj[34].worldX = 30 * gp.tileSize;
        gp.obj[34].worldY = 18 * gp.tileSize;

        gp.obj[35] = new Obj_door();
        gp.obj[35].worldX = 30 * gp.tileSize;
        gp.obj[35].worldY = 18 * gp.tileSize;

        gp.obj[36] = new Obj_doorOpen();
        gp.obj[36].worldX = 22 * gp.tileSize;
        gp.obj[36].worldY = 18 * gp.tileSize;

        gp.obj[37] = new Obj_door();
        gp.obj[37].worldX = 22 * gp.tileSize;
        gp.obj[37].worldY = 18 * gp.tileSize;

        gp.obj[38] = new Obj_doorOpen();
        gp.obj[38].worldX = 14 * gp.tileSize;
        gp.obj[38].worldY = 18 * gp.tileSize;

        gp.obj[39] = new Obj_door();
        gp.obj[39].worldX = 14 * gp.tileSize;
        gp.obj[39].worldY = 18 * gp.tileSize;

        gp.obj[40] = new Obj_doorOpen();
        gp.obj[40].worldX = 6 * gp.tileSize;
        gp.obj[40].worldY = 18 * gp.tileSize;

        gp.obj[41] = new Obj_door();
        gp.obj[41].worldX = 6 * gp.tileSize;
        gp.obj[41].worldY = 18 * gp.tileSize;

        gp.obj[42] = new Obj_doorOpen();
        gp.obj[42].worldX = 38 * gp.tileSize;
        gp.obj[42].worldY = 18 * gp.tileSize;

        gp.obj[43] = new Obj_door();
        gp.obj[43].worldX = 38 * gp.tileSize;
        gp.obj[43].worldY = 18 * gp.tileSize;

        //fila 3
        gp.obj[44] = new Obj_doorOpen();
        gp.obj[44].worldX = 30 * gp.tileSize;
        gp.obj[44].worldY = 26 * gp.tileSize;

        gp.obj[45] = new Obj_door();
        gp.obj[45].worldX = 30 * gp.tileSize;
        gp.obj[45].worldY = 26 * gp.tileSize;

        gp.obj[46] = new Obj_doorOpen();
        gp.obj[46].worldX = 22 * gp.tileSize;
        gp.obj[46].worldY = 26 * gp.tileSize;

        gp.obj[47] = new Obj_door();
        gp.obj[47].worldX = 22 * gp.tileSize;
        gp.obj[47].worldY = 26 * gp.tileSize;

        gp.obj[48] = new Obj_doorOpen();
        gp.obj[48].worldX = 14 * gp.tileSize;
        gp.obj[48].worldY = 26 * gp.tileSize;

        gp.obj[49] = new Obj_door();
        gp.obj[49].worldX = 14 * gp.tileSize;
        gp.obj[49].worldY = 26 * gp.tileSize;

        gp.obj[50] = new Obj_doorOpen();
        gp.obj[50].worldX = 6 * gp.tileSize;
        gp.obj[50].worldY = 26 * gp.tileSize;

        gp.obj[51] = new Obj_door();
        gp.obj[51].worldX = 6 * gp.tileSize;
        gp.obj[51].worldY = 26 * gp.tileSize;

        gp.obj[52] = new Obj_doorOpen();
        gp.obj[52].worldX = 38 * gp.tileSize;
        gp.obj[52].worldY = 26 * gp.tileSize;

        gp.obj[53] = new Obj_door();
        gp.obj[53].worldX = 38 * gp.tileSize;
        gp.obj[53].worldY = 26 * gp.tileSize;

        //fila 4
        gp.obj[54] = new Obj_doorOpen();
        gp.obj[54].worldX = 30 * gp.tileSize;
        gp.obj[54].worldY = 34 * gp.tileSize;

        gp.obj[55] = new Obj_door();
        gp.obj[55].worldX = 30 * gp.tileSize;
        gp.obj[55].worldY = 34 * gp.tileSize;

        gp.obj[56] = new Obj_doorOpen();
        gp.obj[56].worldX = 22 * gp.tileSize;
        gp.obj[56].worldY = 34 * gp.tileSize;

        gp.obj[57] = new Obj_door();
        gp.obj[57].worldX = 22 * gp.tileSize;
        gp.obj[57].worldY = 34 * gp.tileSize;

        gp.obj[58] = new Obj_doorOpen();
        gp.obj[58].worldX = 14 * gp.tileSize;
        gp.obj[58].worldY = 34 * gp.tileSize;

        gp.obj[59] = new Obj_door();
        gp.obj[59].worldX = 14 * gp.tileSize;
        gp.obj[59].worldY = 34 * gp.tileSize;

        gp.obj[60] = new Obj_doorOpen();
        gp.obj[60].worldX = 6 * gp.tileSize;
        gp.obj[60].worldY = 34 * gp.tileSize;

        gp.obj[61] = new Obj_door();
        gp.obj[61].worldX = 6 * gp.tileSize;
        gp.obj[61].worldY = 34 * gp.tileSize;

        gp.obj[62] = new Obj_doorOpen();
        gp.obj[62].worldX = 38 * gp.tileSize;
        gp.obj[62].worldY = 34 * gp.tileSize;

        gp.obj[63] = new Obj_door();
        gp.obj[63].worldX = 38 * gp.tileSize;
        gp.obj[63].worldY = 34 * gp.tileSize;

        //fila 5
        gp.obj[64] = new Obj_doorOpen();
        gp.obj[64].worldX = 30 * gp.tileSize;
        gp.obj[64].worldY = 40 * gp.tileSize;

        gp.obj[65] = new Obj_door();
        gp.obj[65].worldX = 30 * gp.tileSize;
        gp.obj[65].worldY = 40 * gp.tileSize;

        gp.obj[66] = new Obj_doorOpen();
        gp.obj[66].worldX = 22 * gp.tileSize;
        gp.obj[66].worldY = 40 * gp.tileSize;

        gp.obj[67] = new Obj_door();
        gp.obj[67].worldX = 22 * gp.tileSize;
        gp.obj[67].worldY = 40 * gp.tileSize;

        gp.obj[68] = new Obj_doorOpen();
        gp.obj[68].worldX = 14 * gp.tileSize;
        gp.obj[68].worldY = 40 * gp.tileSize;

        gp.obj[69] = new Obj_door();
        gp.obj[69].worldX = 14 * gp.tileSize;
        gp.obj[69].worldY = 40 * gp.tileSize;

        gp.obj[70] = new Obj_doorOpen();
        gp.obj[70].worldX = 6 * gp.tileSize;
        gp.obj[70].worldY = 40 * gp.tileSize;

        gp.obj[71] = new Obj_door();
        gp.obj[71].worldX = 6 * gp.tileSize;
        gp.obj[71].worldY = 40 * gp.tileSize;

        gp.obj[72] = new Obj_doorOpen();
        gp.obj[72].worldX = 38 * gp.tileSize;
        gp.obj[72].worldY = 40 * gp.tileSize;

        gp.obj[73] = new Obj_door();
        gp.obj[73].worldX = 38 * gp.tileSize;
        gp.obj[73].worldY = 40 * gp.tileSize;

        //fila X
        gp.obj[74] = new Obj_doorOpen();
        gp.obj[74].worldX = 4 * gp.tileSize;
        gp.obj[74].worldY = 14 * gp.tileSize;

        gp.obj[75] = new Obj_door();
        gp.obj[75].worldX = 4 * gp.tileSize;
        gp.obj[75].worldY = 14 * gp.tileSize;

        gp.obj[76] = new Obj_doorOpen();
        gp.obj[76].worldX = 10 * gp.tileSize;
        gp.obj[76].worldY = 14 * gp.tileSize;

        gp.obj[77] = new Obj_door();
        gp.obj[77].worldX = 10 * gp.tileSize;
        gp.obj[77].worldY = 14 * gp.tileSize;

        gp.obj[78] = new Obj_doorOpen();
        gp.obj[78].worldX = 18 * gp.tileSize;
        gp.obj[78].worldY = 14 * gp.tileSize;

        gp.obj[79] = new Obj_door();
        gp.obj[79].worldX = 18 * gp.tileSize;
        gp.obj[79].worldY = 14 * gp.tileSize;

        gp.obj[80] = new Obj_doorOpen();
        gp.obj[80].worldX = 26 * gp.tileSize;
        gp.obj[80].worldY = 14 * gp.tileSize;

        gp.obj[81] = new Obj_door();
        gp.obj[81].worldX = 26 * gp.tileSize;
        gp.obj[81].worldY = 14 * gp.tileSize;

        gp.obj[82] = new Obj_doorOpen();
        gp.obj[82].worldX = 34 * gp.tileSize;
        gp.obj[82].worldY = 14 * gp.tileSize;

        gp.obj[83] = new Obj_door();
        gp.obj[83].worldX = 34 * gp.tileSize;
        gp.obj[83].worldY = 14 * gp.tileSize;

        gp.obj[84] = new Obj_doorOpen();
        gp.obj[84].worldX = 40 * gp.tileSize;
        gp.obj[84].worldY = 14 * gp.tileSize;

        gp.obj[85] = new Obj_door();
        gp.obj[85].worldX = 40 * gp.tileSize;
        gp.obj[85].worldY = 14 * gp.tileSize;

        //fila x2
        gp.obj[86] = new Obj_doorOpen();
        gp.obj[86].worldX = 4 * gp.tileSize;
        gp.obj[86].worldY = 22 * gp.tileSize;

        gp.obj[87] = new Obj_door();
        gp.obj[87].worldX = 4 * gp.tileSize;
        gp.obj[87].worldY = 22 * gp.tileSize;

        gp.obj[88] = new Obj_doorOpen();
        gp.obj[88].worldX = 10 * gp.tileSize;
        gp.obj[88].worldY = 22 * gp.tileSize;

        gp.obj[89] = new Obj_door();
        gp.obj[89].worldX = 10 * gp.tileSize;
        gp.obj[89].worldY = 22 * gp.tileSize;

        gp.obj[90] = new Obj_doorOpen();
        gp.obj[90].worldX = 18 * gp.tileSize;
        gp.obj[90].worldY = 22 * gp.tileSize;

        gp.obj[91] = new Obj_door();
        gp.obj[91].worldX = 18 * gp.tileSize;
        gp.obj[91].worldY = 22 * gp.tileSize;

        gp.obj[92] = new Obj_doorOpen();
        gp.obj[92].worldX = 26 * gp.tileSize;
        gp.obj[92].worldY = 22 * gp.tileSize;

        gp.obj[93] = new Obj_door();
        gp.obj[93].worldX = 26 * gp.tileSize;
        gp.obj[93].worldY = 22 * gp.tileSize;

        gp.obj[94] = new Obj_doorOpen();
        gp.obj[94].worldX = 34 * gp.tileSize;
        gp.obj[94].worldY = 22 * gp.tileSize;

        gp.obj[95] = new Obj_door();
        gp.obj[95].worldX = 34 * gp.tileSize;
        gp.obj[95].worldY = 22 * gp.tileSize;

        gp.obj[96] = new Obj_doorOpen();
        gp.obj[96].worldX = 40 * gp.tileSize;
        gp.obj[96].worldY = 22 * gp.tileSize;

        gp.obj[97] = new Obj_door();
        gp.obj[97].worldX = 40 * gp.tileSize;
        gp.obj[97].worldY = 22 * gp.tileSize;

        //fila x3
        gp.obj[98] = new Obj_doorOpen();
        gp.obj[98].worldX = 4 * gp.tileSize;
        gp.obj[98].worldY = 30 * gp.tileSize;

        gp.obj[99] = new Obj_door();
        gp.obj[99].worldX = 4 * gp.tileSize;
        gp.obj[99].worldY = 30 * gp.tileSize;

        gp.obj[100] = new Obj_doorOpen();
        gp.obj[100].worldX = 10 * gp.tileSize;
        gp.obj[100].worldY = 30 * gp.tileSize;

        gp.obj[101] = new Obj_door();
        gp.obj[101].worldX = 10 * gp.tileSize;
        gp.obj[101].worldY = 30 * gp.tileSize;

        gp.obj[102] = new Obj_doorOpen();
        gp.obj[102].worldX = 18 * gp.tileSize;
        gp.obj[102].worldY = 30 * gp.tileSize;

        gp.obj[103] = new Obj_door();
        gp.obj[103].worldX = 18 * gp.tileSize;
        gp.obj[103].worldY = 30 * gp.tileSize;

        gp.obj[104] = new Obj_doorOpen();
        gp.obj[104].worldX = 26 * gp.tileSize;
        gp.obj[104].worldY = 30 * gp.tileSize;

        gp.obj[105] = new Obj_door();
        gp.obj[105].worldX = 26 * gp.tileSize;
        gp.obj[105].worldY = 30 * gp.tileSize;

        gp.obj[106] = new Obj_doorOpen();
        gp.obj[106].worldX = 34 * gp.tileSize;
        gp.obj[106].worldY = 30 * gp.tileSize;

        gp.obj[107] = new Obj_door();
        gp.obj[107].worldX = 34 * gp.tileSize;
        gp.obj[107].worldY = 30 * gp.tileSize;

        gp.obj[108] = new Obj_doorOpen();
        gp.obj[108].worldX = 40 * gp.tileSize;
        gp.obj[108].worldY = 30 * gp.tileSize;

        gp.obj[109] = new Obj_door();
        gp.obj[109].worldX = 40 * gp.tileSize;
        gp.obj[109].worldY = 30 * gp.tileSize;

        //fila x4
        gp.obj[110] = new Obj_doorOpen();
        gp.obj[110].worldX = 4 * gp.tileSize;
        gp.obj[110].worldY = 38 * gp.tileSize;

        gp.obj[111] = new Obj_door();
        gp.obj[111].worldX = 4 * gp.tileSize;
        gp.obj[111].worldY = 38 * gp.tileSize;

        gp.obj[112] = new Obj_doorOpen();
        gp.obj[112].worldX = 10 * gp.tileSize;
        gp.obj[112].worldY = 38 * gp.tileSize;

        gp.obj[113] = new Obj_door();
        gp.obj[113].worldX = 10 * gp.tileSize;
        gp.obj[113].worldY = 38 * gp.tileSize;

        gp.obj[114] = new Obj_doorOpen();
        gp.obj[114].worldX = 18 * gp.tileSize;
        gp.obj[114].worldY = 38 * gp.tileSize;

        gp.obj[114] = new Obj_door();
        gp.obj[114].worldX = 18 * gp.tileSize;
        gp.obj[114].worldY = 38 * gp.tileSize;

        gp.obj[115] = new Obj_doorOpen();
        gp.obj[115].worldX = 26 * gp.tileSize;
        gp.obj[115].worldY = 38 * gp.tileSize;

        gp.obj[116] = new Obj_door();
        gp.obj[116].worldX = 26 * gp.tileSize;
        gp.obj[116].worldY = 38 * gp.tileSize;

        gp.obj[117] = new Obj_doorOpen();
        gp.obj[117].worldX = 34 * gp.tileSize;
        gp.obj[117].worldY = 38 * gp.tileSize;

        gp.obj[118] = new Obj_door();
        gp.obj[118].worldX = 34 * gp.tileSize;
        gp.obj[118].worldY = 38 * gp.tileSize;

        gp.obj[119] = new Obj_doorOpen();
        gp.obj[119].worldX = 40 * gp.tileSize;
        gp.obj[119].worldY = 38 * gp.tileSize;

        gp.obj[120] = new Obj_door();
        gp.obj[120].worldX = 40 * gp.tileSize;
        gp.obj[120].worldY = 38 * gp.tileSize;

        //chests
        gp.obj[121] = new Obj_chest();
        gp.obj[121].worldX = 6 * gp.tileSize;
        gp.obj[121].worldY = 2 * gp.tileSize;
        
        gp.obj[122] = new Obj_chest();
        gp.obj[122].worldX = 14 * gp.tileSize;
        gp.obj[122].worldY = 2 * gp.tileSize;
        
        gp.obj[129] = new Obj_chest();
        gp.obj[129].worldX = 2 * gp.tileSize;
        gp.obj[129].worldY = 30 * gp.tileSize;
        
        gp.obj[132] = new Obj_chest();
        gp.obj[132].worldX = 42 * gp.tileSize;
        gp.obj[132].worldY = 14 * gp.tileSize;
               
        gp.obj[136] = new Obj_chest();
        gp.obj[136].worldX = 6 * gp.tileSize;
        gp.obj[136].worldY = 42 * gp.tileSize;
              
        gp.obj[139] = new Obj_chest();
        gp.obj[139].worldX = 30 * gp.tileSize;
        gp.obj[139].worldY = 42 * gp.tileSize;
        
        gp.obj[140] = new Obj_chest();
        gp.obj[140].worldX = 38 * gp.tileSize;
        gp.obj[140].worldY = 42 * gp.tileSize;
        
        //keys
        gp.obj[141] = new Obj_key();
        gp.obj[141].worldX = 6 * gp.tileSize;
        gp.obj[141].worldY = 6 * gp.tileSize;
        
        gp.obj[142] = new Obj_key();
        gp.obj[142].worldX = 14 * gp.tileSize;
        gp.obj[142].worldY = 6 * gp.tileSize;
        
        gp.obj[143] = new Obj_key();
        gp.obj[143].worldX = 22 * gp.tileSize;
        gp.obj[143].worldY = 6 * gp.tileSize;
        
        gp.obj[144] = new Obj_key();
        gp.obj[144].worldX = 30 * gp.tileSize;
        gp.obj[144].worldY = 6 * gp.tileSize;
        
        gp.obj[145] = new Obj_key();
        gp.obj[145].worldX = 38 * gp.tileSize;
        gp.obj[145].worldY = 6 * gp.tileSize;
        
        gp.obj[146] = new Obj_key();
        gp.obj[146].worldX = 6 * gp.tileSize;
        gp.obj[146].worldY = 14 * gp.tileSize;
        
        gp.obj[147] = new Obj_key();
        gp.obj[147].worldX = 14 * gp.tileSize;
        gp.obj[147].worldY = 14 * gp.tileSize;
        
        gp.obj[148] = new Obj_key();
        gp.obj[148].worldX = 22 * gp.tileSize;
        gp.obj[148].worldY = 14 * gp.tileSize;
        
        gp.obj[149] = new Obj_key();
        gp.obj[149].worldX = 30 * gp.tileSize;
        gp.obj[149].worldY = 14 * gp.tileSize;
        
        gp.obj[150] = new Obj_key();
        gp.obj[150].worldX = 38 * gp.tileSize;
        gp.obj[150].worldY = 14 * gp.tileSize;
        
        gp.obj[151] = new Obj_key();
        gp.obj[151].worldX = 6 * gp.tileSize;
        gp.obj[151].worldY = 22 * gp.tileSize;
        
        gp.obj[152] = new Obj_key();
        gp.obj[152].worldX = 14 * gp.tileSize;
        gp.obj[152].worldY = 22 * gp.tileSize;
        
        gp.obj[153] = new Obj_key();
        gp.obj[153].worldX = 22 * gp.tileSize;
        gp.obj[153].worldY = 22 * gp.tileSize;
        
        gp.obj[154] = new Obj_key();
        gp.obj[154].worldX = 30 * gp.tileSize;
        gp.obj[154].worldY = 22 * gp.tileSize;
        
        gp.obj[155] = new Obj_key();
        gp.obj[155].worldX = 38 * gp.tileSize;
        gp.obj[155].worldY = 22 * gp.tileSize;
        
        gp.obj[156] = new Obj_key();
        gp.obj[156].worldX = 6 * gp.tileSize;
        gp.obj[156].worldY = 30 * gp.tileSize;
        
        gp.obj[157] = new Obj_key();
        gp.obj[157].worldX = 14 * gp.tileSize;
        gp.obj[157].worldY = 30 * gp.tileSize;
        
        gp.obj[158] = new Obj_key();
        gp.obj[158].worldX = 22 * gp.tileSize;
        gp.obj[158].worldY = 30 * gp.tileSize;
        
        gp.obj[159] = new Obj_key();
        gp.obj[159].worldX = 30 * gp.tileSize;
        gp.obj[159].worldY = 30 * gp.tileSize;
        
        gp.obj[160] = new Obj_key();
        gp.obj[160].worldX = 38 * gp.tileSize;
        gp.obj[160].worldY = 30 * gp.tileSize;
        
        gp.obj[161] = new Obj_key();
        gp.obj[161].worldX = 6 * gp.tileSize;
        gp.obj[161].worldY = 38 * gp.tileSize;
        
        gp.obj[162] = new Obj_key();
        gp.obj[162].worldX = 14 * gp.tileSize;
        gp.obj[162].worldY = 38 * gp.tileSize;
        
        gp.obj[163] = new Obj_key();
        gp.obj[163].worldX = 22 * gp.tileSize;
        gp.obj[163].worldY = 38 * gp.tileSize;
        
        gp.obj[164] = new Obj_key();
        gp.obj[164].worldX = 30 * gp.tileSize;
        gp.obj[164].worldY = 38 * gp.tileSize;
        
        gp.obj[165] = new Obj_key();
        gp.obj[165].worldX = 38 * gp.tileSize;
        gp.obj[165].worldY = 38 * gp.tileSize;
    }
}

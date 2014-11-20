/*
 * Copyright (C) 2014 The Smartisan Open Source Project
 * This code has been modified.  Portions copyright (C) 2014, Smartisan Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "LICENSE");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smartisanos.util;

import java.util.HashMap;

public class PinyinHelper {

    private PinyinHelper(){};

    /**
     * Check if the Chinese char has polyphony as a family name.
     *
     */
    public static boolean isPolyphonyFamilyName(char c) {
        return mFamilyNamePolyphonyMap.containsKey(c);
    }

    /**
     * Get pinyin array of the input Chinese char. Will return null, if the
     * char has not polyphony as a family name, .
     *
     * @return pinyin array
     */
    public static String[] getPolyphonyFamilyName(char c) {
        if (mFamilyNamePolyphonyMap.containsKey(c)) {
            return mFamilyNamePolyphonyMap.get(c);
        }
        return null;
    }

    /**
     * Check if the Chinese char has polyphony.
     *
     */
    public static boolean isPolyphony(char c) {
        return mPolyphonyMap.containsKey(c);
    }

    /**
     * Get pinyin array of the input Chinese char. Will return null, If the
     * char has not polyphony.
     *
     * @return pinyin array
     */
    public static String[] getPolyphony(char c) {
        if (mPolyphonyMap.containsKey(c)) {
            return mPolyphonyMap.get(c);
        }
        return null;
    }

    private static HashMap<Character, String[]> mPolyphonyMap = new HashMap<Character, String[]>() {
        {
            put('\u963f', new String[] { "A", "E" }); //阿
            put('\u55c4', new String[] { "A", "SHA" }); //嗄
            put('\u827e', new String[] { "AI", "YI" }); //艾
            put('\u62d7', new String[] { "AO", "NIU" }); //拗
            put('\u6252', new String[] { "BA", "PA" }); //扒
            put('\u94af', new String[] { "BA", "PA" }); //钯
            put('\u8019', new String[] { "BA", "PA" }); //耙
            put('\u67cf', new String[] { "BAI", "BO" }); //柏
            put('\u767e', new String[] { "BAI", "BO" }); //百
            put('\u6273', new String[] { "BAN", "PAN" }); //扳
            put('\u822c', new String[] { "BAN", "BO", "PAN" }); //般
            put('\u5762', new String[] { "BAN", "PAN" }); //坢
            put('\u8180', new String[] { "BANG", "PANG" }); //膀
            put('\u868c', new String[] { "BANG", "BENG" }); //蚌
            put('\u78c5', new String[] { "BANG", "PANG" }); //磅
            put('\u508d', new String[] { "BANG", "PANG" }); //傍
            put('\u6412', new String[] { "BANG", "PENG" }); //搒
            put('\u8584', new String[] { "BAO", "BO" }); //薄
            put('\u5821', new String[] { "BAO", "BU", "PU" }); //堡
            put('\u66b4', new String[] { "BAO", "PU" }); //暴
            put('\u9642', new String[] { "BEI", "PI", "PO" }); //陂
            put('\u7b84', new String[] { "BEI", "BI", "PI" }); //箄
            put('\u6911', new String[] { "BEI", "PI" }); //椑
            put('\u5b5b', new String[] { "BEI", "BO" }); //孛
            put('\u5457', new String[] { "BEI", "BAI" }); //呗
            put('\u681f', new String[] { "BEN", "BING" }); //栟
            put('\u8d32', new String[] { "BEN", "BI" }); //贲
            put('\u580b', new String[] { "BENG", "PENG" }); //堋
            put('\u5421', new String[] { "BI", "PI" }); //吡
            put('\u81c2', new String[] { "BI", "BEI" }); //臂
            put('\u8f9f', new String[] { "BI", "PI" }); //辟
            put('\u88e8', new String[] { "BI", "PI" }); //裨
            put('\u90b2', new String[] { "BI", "BIAN" }); //邲
            put('\u69df', new String[] { "BIN", "BING" }); //槟
            put('\u6241', new String[] { "BIAN", "PIAN" }); //扁
            put('\u4fbf', new String[] { "BIAN", "PIAN" }); //便
            put('\u7f0f', new String[] { "BIAN", "PIAN" }); //缏
            put('\u9aa0', new String[] { "BIAO", "PIAO" }); //骠
            put('\u6753', new String[] { "BIAO", "SHAO" }); //杓
            put('\u73a2', new String[] { "BIN", "FEN" }); //玢
            put('\u5c4f', new String[] { "BING", "PING" }); //屏
            put('\u5265', new String[] { "BO", "BAO" }); //剥
            put('\u6cca', new String[] { "BO", "PO" }); //泊
            put('\u4f2f', new String[] { "BO", "BAI" }); //伯
            put('\u535c', new String[] { "BO", "BU" }); //卜
            put('\u57d4', new String[] { "BU", "PU" }); //埔
            put('\u5693', new String[] { "CA", "CHA" }); //嚓
            put('\u53c2', new String[] { "CAN", "SAN", "SHEN", "CEN" }); //参
            put('\u5072', new String[] { "CAI", "SI" }); //偲
            put('\u4fa7', new String[] { "CE", "ZHAI" }); //侧
            put('\u4f27', new String[] { "CHANG", "CHEN" }); //伧
            put('\u85cf', new String[] { "CANG", "ZANG" }); //藏
            put('\u564c', new String[] { "CENG", "CHENG" }); //噌
            put('\u66fe', new String[] { "CENG", "ZENG" }); //曾
            put('\u9987', new String[] { "CHA", "ZHA" }); //馇
            put('\u5dee', new String[] { "CHA", "CI", "CHAI" }); //差
            put('\u55b3', new String[] { "CHA", "ZHA" }); //喳
            put('\u67e5', new String[] { "CHA", "ZHA" }); //查
            put('\u8336', new String[] { "CHA", "ZHA" }); //茶
            put('\u837c', new String[] { "CHA", "TU" }); //荼
            put('\u6942', new String[] { "CHA", "ZHA" }); //楂
            put('\u63ba', new String[] { "CHAN", "CAN", "SHAN" }); //掺
            put('\u5b71', new String[] { "CHAN", "CAN" }); //孱
            put('\u7985', new String[] { "CHAN", "SHAN" }); //禅
            put('\u5574', new String[] { "CHAN", "TAN" }); //啴
            put('\u98a4', new String[] { "CHAN", "ZHAN" }); //颤
            put('\u957f', new String[] { "CHANG", "ZHANG" }); //长
            put('\u5382', new String[] { "CHANG", "AN" }); //厂
            put('\u739a', new String[] { "CHANG", "YANG" }); //玚
            put('\u7625', new String[] { "CHAI", "CUO" }); //瘥
            put('\u712f', new String[] { "CHAO", "ZHUO" }); //焯
            put('\u5632', new String[] { "CHAO", "ZHAO" }); //嘲
            put('\u671d', new String[] { "CHAO", "ZHAO" }); //朝
            put('\u8f66', new String[] { "CHE", "JU" }); //车
            put('\u8c0c', new String[] { "CHEN", "SHEN" }); //谌
            put('\u79f0', new String[] { "CHEN", "CHENG" }); //称
            put('\u94db', new String[] { "CHENG", "DANG" }); //铛
            put('\u4e58', new String[] { "CHENG", "SHENG" }); //乘
            put('\u6f84', new String[] { "CHENG", "DENG" }); //澄
            put('\u76db', new String[] { "CHENG", "SHENG" }); //盛
            put('\u5319', new String[] { "CHI", "SHI" }); //匙
            put('\u577b', new String[] { "CHI", "DI" }); //坻
            put('\u5c3a', new String[] { "CHI", "CHE" }); //尺
            put('\u91cd', new String[] { "CHONG", "ZHONG" }); //重
            put('\u4ec7', new String[] { "CHOU", "QIU" }); //仇
            put('\u5e6c', new String[] { "CHOU", "DAO" }); //幬
            put('\u677b', new String[] { "CHOU", "NIU" }); //杻
            put('\u81ed', new String[] { "CHOU", "XIU" }); //臭
            put('\u755c', new String[] { "CHU", "XU" }); //畜
            put('\u6b58', new String[] { "CHUA", "XU" }); //歘
            put('\u555c', new String[] { "CHUAI", "CHUO" }); //啜
            put('\u4f20', new String[] { "CHUAN", "ZHUAN" }); //传
            put('\u931e', new String[] { "CHUN", "DUI" }); //錞
            put('\u7ef0', new String[] { "CHUO", "CHAO" }); //绰
            put('\u7ca2', new String[] { "CI", "ZI" }); //粢
            put('\u8308', new String[] { "CI", "ZI" }); //茈
            put('\u4f3a', new String[] { "CI", "SI" }); //伺
            put('\u679e', new String[] { "CONG", "ZONG" }); //枞
            put('\u6512', new String[] { "CUAN", "ZAN" }); //攒
            put('\u64ae', new String[] { "CUO", "ZUO" }); //撮
            put('\u9147', new String[] { "CUO", "ZAN" }); //酇
            put('\u55d2', new String[] { "DA", "TA" }); //嗒
            put('\u5927', new String[] { "DA", "DAI" }); //大
            put('\u5454', new String[] { "DAI", "TAI" }); //呔
            put('\u8bd2', new String[] { "DAI", "YI" }); //诒
            put('\u9a80', new String[] { "DAI", "TAI" }); //骀
            put('\u5355', new String[] { "DAN", "CHAN", "SHAN" }); //单
            put('\u63b8', new String[] { "DAN", "SHAN" }); //掸
            put('\u5f39', new String[] { "DAN", "TAN" }); //弹
            put('\u6fb9', new String[] { "DAN", "TAN" }); //澹
            put('\u53e8', new String[] { "DAO", "TAO" }); //叨
            put('\u5f97', new String[] { "DE", "DEI" }); //得
            put('\u63d0', new String[] { "DI", "TI" }); //提
            put('\u7684', new String[] { "DI", "DE" }); //的
            put('\u8e62', new String[] { "DI", "ZHI" }); //蹢
            put('\u5e95', new String[] { "DI", "DE" }); //底
            put('\u5730', new String[] { "DI", "DE" }); //地
            put('\u6755', new String[] { "DI", "DUO" }); //杕
            put('\u4f43', new String[] { "DIAN", "TIAN" }); //佃
            put('\u94bf', new String[] { "DIAN", "TIAN" }); //钿
            put('\u54a5', new String[] { "DIE", "XI" }); //咥
            put('\u558b', new String[] { "DIE", "ZHA" }); //喋
            put('\u87b2', new String[] { "DIE", "ZHI" }); //螲
            put('\u4e01', new String[] { "DING", "ZHENG" }); //丁
            put('\u4f97', new String[] { "DONG", "TONG" }); //侗
            put('\u578c', new String[] { "DONG", "TONG" }); //垌
            put('\u5cd2', new String[] { "DONG", "TONG" }); //峒
            put('\u6d1e', new String[] { "DONG", "TONG" }); //洞
            put('\u606b', new String[] { "DONG", "TONG" }); //恫
            put('\u90fd', new String[] { "DOU", "DU" }); //都
            put('\u6793', new String[] { "DOU", "ZHU" }); //枓
            put('\u8bfb', new String[] { "DU", "DOU" }); //读
            put('\u5ea6', new String[] { "DUO", "DU" }); //度
            put('\u9566', new String[] { "DUN", "DUI" }); //镦
            put('\u6566', new String[] { "DUN", "DUI" }); //敦
            put('\u8e72', new String[] { "DUN", "CUN" }); //蹲
            put('\u56e4', new String[] { "DUN", "TUN" }); //囤
            put('\u6c8c', new String[] { "DUN", "ZHUAN" }); //沌
            put('\u987f', new String[] { "DUN", "DU" }); //顿
            put('\u54c6', new String[] { "DUO", "CHI" }); //哆
            put('\u67c1', new String[] { "DUO", "TUO" }); //柁
            put('\u6076', new String[] { "E", "WU" }); //恶
            put('\u54e6', new String[] { "E", "O" }); //哦
            put('\u86fe', new String[] { "E", "YI" }); //蛾
            put('\u800f', new String[] { "ER", "NAI" }); //耏
            put('\u756a', new String[] { "FAN", "PAN" }); //番
            put('\u8543', new String[] { "FAN", "BO" }); //蕃
            put('\u7e41', new String[] { "FAN", "PO" }); //繁
            put('\u82be', new String[] { "FEI", "FU" }); //芾
            put('\u9022', new String[] { "FENG", "PANG", "PENG" }); //逢
            put('\u51af', new String[] { "FENG", "PING" }); //冯
            put('\u4f5b', new String[] { "FO", "FU" }); //佛
            put('\u5426', new String[] { "FOU", "PI" }); //否
            put('\u62c2', new String[] { "FU", "BI" }); //拂
            put('\u80f3', new String[] { "GA", "GE" }); //胳
            put('\u80f2', new String[] { "GAI", "HAI" }); //胲
            put('\u76d6', new String[] { "GAI", "GE" }); //盖
            put('\u9550', new String[] { "GAO", "HAO" }); //镐
            put('\u4ee1', new String[] { "GE", "YI" }); //仡
            put('\u7ea5', new String[] { "GE", "HE" }); //纥
            put('\u9978', new String[] { "GE", "LE" }); //饸
            put('\u54af', new String[] { "GE", "KA", "LUO" }); //咯
            put('\u9769', new String[] { "GE", "JI" }); //革
            put('\u86e4', new String[] { "GE", "HA" }); //蛤
            put('\u5408', new String[] { "GE", "HE" }); //合
            put('\u784c', new String[] { "GE", "LUO" }); //硌
            put('\u7ed9', new String[] { "GEI", "JI" }); //给
            put('\u9888', new String[] { "GENG", "JING" }); //颈
            put('\u67b8', new String[] { "GOU", "JU" }); //枸
            put('\u8c37', new String[] { "GU", "YU" }); //谷
            put('\u9e58', new String[] { "GU", "HU" }); //鹘
            put('\u5471', new String[] { "GUA", "GU" }); //呱
            put('\u681d', new String[] { "GUA", "KUO" }); //栝
            put('\u5e7f', new String[] { "GUANG", "AN" }); //广
            put('\u5ec6', new String[] { "GUI", "WEI" }); //廆
            put('\u9c91', new String[] { "GUI", "XIE" }); //鲑
            put('\u6867', new String[] { "GUI", "HUI" }); //桧
            put('\u67dc', new String[] { "GUI", "JU" }); //柜
            put('\u7085', new String[] { "GUI", "JIONG" }); //炅
            put('\u55e8', new String[] { "HAI", "HEI" }); //嗨
            put('\u8fd8', new String[] { "HAI", "HUAN" }); //还
            put('\u592f', new String[] { "HANG", "HEN" }); //夯
            put('\u5df7', new String[] { "HANG", "XIANG" }); //巷
            put('\u542d', new String[] { "HANG", "KENG" }); //吭
            put('\u548c', new String[] { "HE", "HU", "HUO" }); //和
            put('\u8c89', new String[] { "HE", "HAO", "MO" }); //貉
            put('\u6838', new String[] { "HE", "HU" }); //核
            put('\u8679', new String[] { "HONG", "JIANG" }); //虹
            put('\u7ea2', new String[] { "HONG", "GONG" }); //红
            put('\u9e44', new String[] { "HU", "GU" }); //鹄
            put('\u6d52', new String[] { "HU", "XU" }); //浒
            put('\u552c', new String[] { "HU", "XIA" }); //唬
            put('\u54d7', new String[] { "HUA", "HUO" }); //哗
            put('\u90c7', new String[] { "HUAN", "XUN" }); //郇
            put('\u57b8', new String[] { "HUAN", "YUAN" }); //垸
            put('\u571c', new String[] { "HUAN", "YUAN" }); //圜
            put('\u73f2', new String[] { "HUI", "HUN" }); //珲
            put('\u4f1a', new String[] { "HUI", "KUAI" }); //会
            put('\u8364', new String[] { "HUN", "XUN" }); //荤
            put('\u5947', new String[] { "JI", "QI" }); //奇
            put('\u7f09', new String[] { "JI", "QI" }); //缉
            put('\u4e9f', new String[] { "JI", "QI" }); //亟
            put('\u5048', new String[] { "JI", "JIE" }); //偈
            put('\u7cfb', new String[] { "JI", "XI" }); //系
            put('\u8360', new String[] { "JI", "QI" }); //荠
            put('\u5bb6', new String[] { "JIA", "JIE" }); //家
            put('\u4f3d', new String[] { "JIA", "GA", "QIE" }); //伽
            put('\u8304', new String[] { "JIA", "QIE" }); //茄
            put('\u8d3e', new String[] { "JIA", "GU" }); //贾
            put('\u89c1', new String[] { "JIAN", "XIAN" }); //见
            put('\u5c06', new String[] { "JIANG", "QIANG" }); //将
            put('\u964d', new String[] { "JIANG", "XIANG" }); //降
            put('\u7f34', new String[] { "JIAO", "ZHUO" }); //缴
            put('\u6e6b', new String[] { "JIAO", "QIU" }); //湫
            put('\u56bc', new String[] { "JIAO", "JUE" }); //嚼
            put('\u4fa5', new String[] { "JIAO", "YAO" }); //侥
            put('\u89d2', new String[] { "JIAO", "JUE" }); //角
            put('\u811a', new String[] { "JIAO", "JUE" }); //脚
            put('\u527f', new String[] { "JIAO", "CHAO" }); //剿
            put('\u6821', new String[] { "JIAO", "XIAO" }); //校
            put('\u89c9', new String[] { "JIAO", "JUE" }); //觉
            put('\u89e3', new String[] { "JIE", "XIE" }); //解
            put('\u82a5', new String[] { "JIE", "GAI" }); //芥
            put('\u85c9', new String[] { "JIE", "JI" }); //藉
            put('\u77dc', new String[] { "JIN", "QIN", "GUAN" }); //矜
            put('\u52b2', new String[] { "JIN", "JING" }); //劲
            put('\u9753', new String[] { "JING", "LIANG" }); //靓
            put('\u9f9f', new String[] { "JUN", "GUI", "QIU" }); //龟
            put('\u5480', new String[] { "JU", "ZUI" }); //咀
            put('\u53e5', new String[] { "JU", "GOU" }); //句
            put('\u96bd', new String[] { "JUAN", "JUN" }); //隽
            put('\u5671', new String[] { "JUE", "XUE" }); //噱
            put('\u6d5a', new String[] { "JUN", "XUN" }); //浚
            put('\u5496', new String[] { "KA", "GA" }); //咖
            put('\u5361', new String[] { "KA", "QIA" }); //卡
            put('\u6977', new String[] { "KAI", "JIE" }); //楷
            put('\u69db', new String[] { "KAN", "JIAN" }); //槛
            put('\u5d41', new String[] { "KAN", "ZHAN" }); //嵁
            put('\u961a', new String[] { "KAN", "HAN" }); //阚
            put('\u625b', new String[] { "KANG", "GANG" }); //扛
            put('\u58f3', new String[] { "KE", "QIAO" }); //壳
            put('\u54b3', new String[] { "KE", "HAI" }); //咳
            put('\u514b', new String[] { "KE", "KEI" }); //克
            put('\u6d4d', new String[] { "KUAI", "HUI" }); //浍
            put('\u532e', new String[] { "KUI", "GUI" }); //匮
            put('\u814a', new String[] { "LA", "XI" }); //腊
            put('\u8721', new String[] { "LA", "ZHA" }); //蜡
            put('\u83a8', new String[] { "LANG", "LIANG" }); //莨
            put('\u70d9', new String[] { "LAO", "LUO" }); //烙
            put('\u52d2', new String[] { "LE", "LEI" }); //勒
            put('\u808b', new String[] { "LEI", "LE" }); //肋
            put('\u68f1', new String[] { "LENG", "LING" }); //棱
            put('\u680e', new String[] { "LI", "YUE" }); //栎
            put('\u9b32', new String[] { "LI", "GE" }); //鬲
            put('\u8dde', new String[] { "LI", "LUO" }); //跞
            put('\u4fe9', new String[] { "LIA", "LIANG" }); //俩
            put('\u6f66', new String[] { "LIAO", "LAO" }); //潦
            put('\u4e86', new String[] { "LIAO", "LE" }); //了
            put('\u84fc', new String[] { "LIAO", "LU" }); //蓼
            put('\u65bf', new String[] { "LIU", "YOU" }); //斿
            put('\u788c', new String[] { "LIU", "LU" }); //碌
            put('\u6cf7', new String[] { "LONG", "SHUANG" }); //泷
            put('\u507b', new String[] { "LOU", "LV" }); //偻
            put('\u9732', new String[] { "LU", "LOU" }); //露
            put('\u9646', new String[] { "LU", "LIU" }); //陆
            put('\u634b', new String[] { "LV", "LUO" }); //捋
            put('\u7eff', new String[] { "LV", "LU" }); //绿
            put('\u7387', new String[] { "LV", "SHUAI" }); //率
            put('\u7eb6', new String[] { "LUN", "GUAN" }); //纶
            put('\u7edc', new String[] { "LUO", "LAO" }); //络
            put('\u843d', new String[] { "LUO", "LAO", "LA" }); //落
            put('\u6f2f', new String[] { "LUO", "TA" }); //漯
            put('\u8109', new String[] { "MO", "MAI" }); //脉
            put('\u57cb', new String[] { "MAI", "MAN" }); //埋
            put('\u8513', new String[] { "MAN", "WAN" }); //蔓
            put('\u6c13', new String[] { "MANG", "MENG" }); //氓
            put('\u5192', new String[] { "MAO", "MO" }); //冒
            put('\u6ca1', new String[] { "MEI", "MO" }); //没
            put('\u4eb9', new String[] { "MEN", "WEI" }); //亹
            put('\u9e8b', new String[] { "MI", "MEI" }); //麋
            put('\u79d8', new String[] { "MI", "BI" }); //秘
            put('\u6ccc', new String[] { "MI", "BI" }); //泌
            put('\u5b93', new String[] { "MI", "FU" }); //宓
            put('\u84c2', new String[] { "MI", "MING" }); //蓂
            put('\u6e11', new String[] { "MIAN", "SHENG" }); //渑
            put('\u9efe', new String[] { "MIN", "MIAN" }); //黾
            put('\u6a21', new String[] { "MO", "MU" }); //模
            put('\u6469', new String[] { "MO", "MA" }); //摩
            put('\u62b9', new String[] { "MO", "MA" }); //抹
            put('\u7f2a', new String[] { "MOU", "MIU", "MIAO" }); //缪
            put('\u725f', new String[] { "MOU", "MU" }); //牟
            put('\u90a3', new String[] { "NA", "NEI", "NUO" }); //那
            put('\u5357', new String[] { "NAN", "NA" }); //南
            put('\u5462', new String[] { "NE", "NI" }); //呢
            put('\u9e1f', new String[] { "NIAO", "DIAO" }); //鸟
            put('\u5c3f', new String[] { "NIAO", "SUI" }); //尿
            put('\u4e5c', new String[] { "NIE", "MIE" }); //乜
            put('\u5f04', new String[] { "NONG", "LONG" }); //弄
            put('\u759f', new String[] { "NVE", "YAO" }); //疟
            put('\u5a1c', new String[] { "NUO", "NA" }); //娜
            put('\u6eba', new String[] { "NI", "NIAO" }); //溺
            put('\u8feb', new String[] { "PAI", "PO" }); //迫
            put('\u80d6', new String[] { "PAN", "PANG" }); //胖
            put('\u5228', new String[] { "PAO", "BAO" }); //刨
            put('\u70ae', new String[] { "PAO", "BAO" }); //炮
            put('\u6ddc', new String[] { "PENG", "PING" }); //淜
            put('\u9b44', new String[] { "PO", "TUO" }); //魄
            put('\u812f', new String[] { "PU", "FU" }); //脯
            put('\u6734', new String[] { "PU", "PO", "PIAO" }); //朴
            put('\u7011', new String[] { "PU", "BAO" }); //瀑
            put('\u66dd', new String[] { "PU", "BAO" }); //曝
            put('\u6816', new String[] { "QI", "XI" }); //栖
            put('\u671f', new String[] { "QI", "JI" }); //期
            put('\u8e4a', new String[] { "QI", "XI" }); //蹊
            put('\u5176', new String[] { "QI", "JI" }); //其
            put('\u9a91', new String[] { "QI", "JI" }); //骑
            put('\u9f50', new String[] { "QI", "JI" }); //齐
            put('\u7a3d', new String[] { "QI", "JI" }); //稽
            put('\u7947', new String[] { "QI", "ZHI" }); //祇
            put('\u5951', new String[] { "QI", "XIE" }); //契
            put('\u780c', new String[] { "QI", "QIE" }); //砌
            put('\u8368', new String[] { "QIAN", "XUN" }); //荨
            put('\u6d45', new String[] { "QIAN", "JIAN" }); //浅
            put('\u831c', new String[] { "QIAN", "XI" }); //茜
            put('\u614a', new String[] { "QIAN", "QIE" }); //慊
            put('\u5f3a', new String[] { "QIANG", "JIANG" }); //强
            put('\u5ce4', new String[] { "QIAO", "JIAO" }); //峤
            put('\u9798', new String[] { "QIAO", "SHAO" }); //鞘
            put('\u8d84', new String[] { "QIE", "JU" }); //趄
            put('\u90c4', new String[] { "QIE", "XI" }); //郄
            put('\u4eb2', new String[] { "QIN", "QING" }); //亲
            put('\u6eb1', new String[] { "QIN", "ZHEN" }); //溱
            put('\u7dae', new String[] { "QING", "QI" }); //綮
            put('\u533a', new String[] { "QU", "OU" }); //区
            put('\u5708', new String[] { "QUAN", "JUAN" }); //圈
            put('\u96c0', new String[] { "QUE", "QIAO" }); //雀
            put('\u82e5', new String[] { "RUO", "RE" }); //若
            put('\u8272', new String[] { "SE", "SHAI" }); //色
            put('\u585e', new String[] { "SE", "SAI" }); //塞
            put('\u6eb9', new String[] { "SE", "SUO" }); //溹
            put('\u4fdf', new String[] { "SI", "QI" }); //俟
            put('\u772d', new String[] { "SUI", "HUI" }); //眭
            put('\u5239', new String[] { "SHA", "CHA" }); //刹
            put('\u53a6', new String[] { "SHA", "XIA" }); //厦
            put('\u6749', new String[] { "SHAN", "SHA" }); //杉
            put('\u5261', new String[] { "SHAN", "YAN" }); //剡
            put('\u82d5', new String[] { "SHAO", "TIAO" }); //苕
            put('\u53ec', new String[] { "SHAO", "ZHAO" }); //召
            put('\u6298', new String[] { "SHE", "ZHE" }); //折
            put('\u5c04', new String[] { "SHE", "YE", "YI" }); //射
            put('\u8398', new String[] { "SHEN", "XIN" }); //莘
            put('\u4ec0', new String[] { "SHEN", "SHI" }); //什
            put('\u6c88', new String[] { "SHEN", "CHEN" }); //沈
            put('\u845a', new String[] { "SHEN", "REN" }); //葚
            put('\u8bc6', new String[] { "SHI", "ZHI" }); //识
            put('\u77f3', new String[] { "SHI", "DAN" }); //石
            put('\u62fe', new String[] { "SHI", "SHE" }); //拾
            put('\u4f3c', new String[] { "SHI", "SI" }); //似
            put('\u87ab', new String[] { "SHI", "ZHE" }); //螫
            put('\u9002', new String[] { "SHI", "KUO" }); //适
            put('\u719f', new String[] { "SHU", "SHOU" }); //熟
            put('\u672f', new String[] { "SHU", "ZHU" }); //术
            put('\u4fde', new String[] { "SHU", "YU" }); //俞
            put('\u8bf4', new String[] { "SHUI", "SHUO" }); //说
            put('\u6570', new String[] { "SHUO", "SHU" }); //数
            put('\u838e', new String[] { "SUO", "SHA" }); //莎
            put('\u5fea', new String[] { "SONG", "ZHONG" }); //忪
            put('\u7f29', new String[] { "SUO", "SU" }); //缩
            put('\u6c93', new String[] { "TA", "DA" }); //沓
            put('\u62d3', new String[] { "TA", "TUO" }); //拓
            put('\u8983', new String[] { "TAN", "QIN" }); //覃
            put('\u9561', new String[] { "TAN", "XIN" }); //镡
            put('\u7118', new String[] { "TAO", "DAO" }); //焘
            put('\u9676', new String[] { "TAO", "YAO" }); //陶
            put('\u6c64', new String[] { "TANG", "SHANG" }); //汤
            put('\u5018', new String[] { "TANG", "CHANG" }); //倘
            put('\u4ff6', new String[] { "TI", "CHU" }); //俶
            put('\u8351', new String[] { "TI", "YI" }); //荑
            put('\u8c03', new String[] { "TIAO", "DIAO" }); //调
            put('\u929a', new String[] { "TIAO", "DIAO", "YAO" }); //銚
            put('\u753a', new String[] { "TING", "DING" }); //町
            put('\u6883', new String[] { "TING", "DING" }); //梃
            put('\u5c6f', new String[] { "TUN", "ZHUN" }); //屯
            put('\u9a6e', new String[] { "TUO", "DUO" }); //驮
            put('\u5d34', new String[] { "WAI", "WEI" }); //崴
            put('\u839e', new String[] { "WAN", "GUAN" }); //莞
            put('\u83c0', new String[] { "WAN", "YU" }); //菀
            put('\u4e07', new String[] { "WAN", "MO" }); //万
            put('\u5729', new String[] { "WEI", "XU" }); //圩
            put('\u5c3e', new String[] { "WEI", "YI" }); //尾
            put('\u9697', new String[] { "WEI", "KUI" }); //隗
            put('\u5c09', new String[] { "WEI", "YU" }); //尉
            put('\u851a', new String[] { "WEI", "YU" }); //蔚
            put('\u8f92', new String[] { "WEN", "YUN" }); //辒
            put('\u6c76', new String[] { "WEN", "MEN" }); //汶
            put('\u6da1', new String[] { "WO", "GUO" }); //涡
            put('\u90d7', new String[] { "XI", "CHI" }); //郗
            put('\u94e3', new String[] { "XI", "XIAN" }); //铣
            put('\u620f', new String[] { "XI", "HU" }); //戏
            put('\u5413', new String[] { "XIA", "HE" }); //吓
            put('\u7ea4', new String[] { "XIAN", "QIAN" }); //纤
            put('\u6d17', new String[] { "XIAN", "XI" }); //洗
            put('\u9889', new String[] { "XIE", "JIE" }); //颉
            put('\u884c', new String[] { "XING", "HANG", "HENG" }); //行
            put('\u8365', new String[] { "XING", "YING" }); //荥
            put('\u7701', new String[] { "XING", "SHENG" }); //省
            put('\u5bbf', new String[] { "XIU", "SU" }); //宿
            put('\u620c', new String[] { "XU", "GU" }); //戌
            put('\u524a', new String[] { "XUE", "XIAO" }); //削
            put('\u8840', new String[] { "XUE", "XIE" }); //血
            put('\u6bb7', new String[] { "YAN", "YIN" }); //殷
            put('\u54bd', new String[] { "YAN", "YE" }); //咽
            put('\u6e6e', new String[] { "YAN", "YIN" }); //湮
            put('\u82ab', new String[] { "YAN", "YUAN" }); //芫
            put('\u94a5', new String[] { "YAO", "YUE" }); //钥
            put('\u53f6', new String[] { "YE", "XIE" }); //叶
            put('\u7719', new String[] { "YI", "CHI" }); //眙
            put('\u9057', new String[] { "YI", "WEI" }); //遗
            put('\u65bc', new String[] { "YU", "WU" }); //於
            put('\u5581', new String[] { "YU", "YONG" }); //喁
            put('\u71a8', new String[] { "YU", "YUN" }); //熨
            put('\u80b2', new String[] { "YU", "YAO" }); //育
            put('\u5401', new String[] { "YU", "XU" }); //吁
            put('\u5458', new String[] { "YUAN", "YUN" }); //员
            put('\u4e50', new String[] { "YUE", "LE", "YAO" }); //乐
            put('\u7ea6', new String[] { "YUE", "YAO" }); //约
            put('\u7b60', new String[] { "YUN", "JUN" }); //筠
            put('\u51ff', new String[] { "ZAO", "ZUO" }); //凿
            put('\u4ed4', new String[] { "ZAI", "ZI" }); //仔
            put('\u62e9', new String[] { "ZE", "ZHAI" }); //择
            put('\u7b2e', new String[] { "ZE", "ZUO" }); //笮
            put('\u5179', new String[] { "ZI", "CI" }); //兹
            put('\u5958', new String[] { "ZANG", "ZHUANG" }); //奘
            put('\u624e', new String[] { "ZHA", "ZA" }); //扎
            put('\u8f67', new String[] { "ZHA", "YA" }); //轧
            put('\u781f', new String[] { "ZHA", "ZUO" }); //砟
            put('\u7fdf', new String[] { "ZHAI", "DI" }); //翟
            put('\u7c98', new String[] { "ZHAN", "NIAN" }); //粘
            put('\u5541', new String[] { "ZHAO", "ZHOU" }); //啁
            put('\u7740', new String[] { "ZHAO", "ZHUO" }); //着
            put('\u722a', new String[] { "ZHAO", "ZHUA" }); //爪
            put('\u5431', new String[] { "ZHI", "ZI" }); //吱
            put('\u6b96', new String[] { "ZHI", "SHI" }); //殖
            put('\u5cd9', new String[] { "ZHI", "SHI" }); //峙
            put('\u79cd', new String[] { "ZHONG", "CHONG" }); //种
            put('\u5c5e', new String[] { "ZHU", "SHU" }); //属
            put('\u891a', new String[] { "ZHU", "CHU" }); //褚
            put('\u8457', new String[] { "ZHU", "ZHE", "ZHUO" }); //著
            put('\u8d5a', new String[] { "ZHUAN", "ZUAN" }); //赚
            put('\u5e62', new String[] { "ZHUANG", "CHUANG" }); //幢
            put('\u690e', new String[] { "ZHUI", "CHUI" }); //椎
            put('\u7efc', new String[] { "ZENG", "ZONG" }); //综
            put('\u5352', new String[] { "ZU", "CU" }); //卒
            put('\u67de', new String[] { "ZUO", "ZHA" }); //柞
            put('\u9162', new String[] { "ZUO", "CU" }); //酢
        }
    };
    private static HashMap<Character, String[]> mFamilyNamePolyphonyMap = new HashMap<Character, String[]>() {
        {
            put('\u79cd', new String[] { "ZHONG", "CHONG" } ); //种
            put('\u8c0c', new String[] { "CHEN" , "SHEN"} ); //谌
            put('\u76d6', new String[] {"GE","GAI"} ); //盖
            put('\u90c7', new String[] {"HUAN","XUN"} ); //郇
            put('\u8983', new String[] {"QIN","TAN"} ); //覃
            put('\u5355', new String[] {"DAN","SHAN"} ); //单
            put('\u53ec', new String[] {"ZHAO","SHAO"} ); //召
            put('\u851a', new String[] {"YU","WEI"} ); //蔚
            put('\u9697', new String[] {"WEI","KUI"} ); //隗
            put('\u90d7', new String[] {"XI","CHI"} ); //郗
            put('\u89e3', new String[] {"XIE","JIE"} ); //解
            put('\u4e50', new String[] {"YUE","LE"} ); //乐
            put('\u7fdf', new String[] {"ZHAI","DI"} ); //翟
            put('\u67e5', new String[] {"ZHA","CHA"} ); //查
            put('\u963f', new String[] { "A", "E" }); //阿
            put('\u827e', new String[] { "AI", "YI" }); //艾
            put('\u66b4', new String[] { "BAO", "PU" }); //暴
            put('\u4fbf', new String[] { "BIAN", "PIAN" }); //便
            put('\u85cf', new String[] { "CANG", "ZANG" }); //藏
            put('\u66fe', new String[] { "CENG", "ZENG" }); //曾
            put('\u671d', new String[] { "CHAO", "ZHAO" }); //朝
            put('\u8f66', new String[] { "CHE", "JU" }); //车
            put('\u76db', new String[] { "CHENG", "SHENG" }); //盛
            put('\u4ec7', new String[] { "CHOU", "QIU" }); //仇
            put('\u4f20', new String[] { "CHUAN", "ZHUAN" }); //传
            put('\u63d0', new String[] { "DI", "TI" }); //提
            put('\u4e01', new String[] { "DING", "ZHENG" }); //丁
            put('\u800f', new String[] { "ER", "NAI" }); //耏
            put('\u7e41', new String[] { "FAN", "PO" }); //繁
            put('\u9022', new String[] { "FENG", "PANG" }); //逢
            put('\u51af', new String[] { "FENG", "PING" }); //冯
            put('\u5408', new String[] { "GE", "HE" }); //合
            put('\u5e7f', new String[] { "GUANG", "AN" }); //广
            put('\u7085', new String[] { "GUI", "JIONG" }); //炅
            put('\u4f1a', new String[] { "HUI", "KUAI" }); //会
            put('\u5947', new String[] { "JI", "QI" }); //奇
            put('\u8d3e', new String[] { "JIA", "GU" }); //贾
            put('\u89c1', new String[] { "JIAN", "XIAN" }); //见
            put('\u5c06', new String[] { "JIANG", "QIANG" }); //将
            put('\u964d', new String[] { "JIANG", "XIANG" }); //降
            put('\u7f34', new String[] { "JIAO", "ZHUO" }); //缴
            put('\u6821', new String[] { "JIAO", "XIAO" }); //校
            put('\u53e5', new String[] { "JU", "GOU" }); //句
            put('\u5361', new String[] { "KA", "QIA" }); //卡
            put('\u961a', new String[] { "KAN", "HAN" }); //阚
            put('\u7387', new String[] { "LV", "SHUAI" }); //率
            put('\u79d8', new String[] { "MI", "BI" }); //秘
            put('\u9e1f', new String[] { "NIAO", "DIAO" }); //鸟
            put('\u4e5c', new String[] { "NIE", "MIE" }); //乜
            put('\u9f50', new String[] { "QI", "JI" }); //齐
            put('\u7a3d', new String[] { "QI", "JI" }); //稽
            put('\u5f3a', new String[] { "QIANG", "JIANG" }); //强
            put('\u90c4', new String[] { "QIE", "XI" }); //郄
            put('\u533a', new String[] { "QU", "OU" }); //区
            put('\u5708', new String[] { "QUAN", "JUAN" }); //圈
            put('\u772d', new String[] { "SUI", "HUI" }); //眭
            put('\u5239', new String[] { "SHA", "CHA" }); //刹
            put('\u6298', new String[] { "SHE", "ZHE" }); //折
            put('\u8398', new String[] { "SHEN", "XIN" }); //莘
            put('\u6c88', new String[] { "SHEN", "CHEN" }); //沈
            put('\u77f3', new String[] { "SHI", "DAN" }); //石
            put('\u9561', new String[] { "TAN", "XIN" }); //镡
            put('\u9676', new String[] { "TAO", "YAO" }); //陶
            put('\u6c64', new String[] { "TANG", "SHANG" }); //汤
            put('\u4e07', new String[] { "WAN", "MO" }); //万
            put('\u5c09', new String[] { "WEI", "YU" }); //尉
            put('\u6c76', new String[] { "WEN", "MEN" }); //汶
            put('\u9889', new String[] { "XIE", "JIE" }); //颉
            put('\u884c', new String[] { "XING", "HANG" }); //行
            put('\u7701', new String[] { "XING", "SHENG" }); //省
            put('\u5bbf', new String[] { "XIU", "SU" }); //宿
            put('\u53f6', new String[] { "YE", "XIE" }); //叶
            put('\u65bc', new String[] { "YU", "WU" }); //於
            put('\u5401', new String[] { "YU", "XU" }); //吁
            put('\u8f67', new String[] { "ZHA", "YA" }); //轧
            put('\u7c98', new String[] { "ZHAN", "NIAN" }); //粘
            put('\u891a', new String[] { "ZHU", "CHU" }); //褚
        }
    };



}

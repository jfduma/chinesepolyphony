/*
 * Copyright (C) 2014 The Smartisan Open Source Project
 * This code has been modified.  Portions copyright (C) 2014, Smartisan Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

package com.android.contacts;

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
            put('\u963f', new String[] { "a", "e" }); //阿
            put('\u55c4', new String[] { "a", "sha" }); //嗄
            put('\u827e', new String[] { "ai", "yi" }); //艾
            put('\u71ac', new String[] { "ao", "ao" }); //熬
            put('\u62d7', new String[] { "ao", "niu" }); //拗
            put('\u6252', new String[] { "ba", "pa" }); //扒
            put('\u94af', new String[] { "ba", "pa" }); //钯
            put('\u8019', new String[] { "ba", "pa" }); //耙
            put('\u67cf', new String[] { "bai", "bo", "bo" }); //柏
            put('\u767e', new String[] { "bai", "bai", "bo" }); //百
            put('\u6273', new String[] { "ban", "pan" }); //扳
            put('\u822c', new String[] { "ban", "bo", "pan" }); //般
            put('\u5762', new String[] { "ban", "pan" }); //坢
            put('\u8180', new String[] { "bang", "pang", "pang" }); //膀
            put('\u868c', new String[] { "bang", "beng" }); //蚌
            put('\u78c5', new String[] { "bang", "pang" }); //磅
            put('\u508d', new String[] { "bang", "pang", "bang" }); //傍
            put('\u6412', new String[] { "bang", "peng" }); //搒
            put('\u8584', new String[] { "bao", "bo", "bo" }); //薄
            put('\u5821', new String[] { "bao", "bu", "pu" }); //堡
            put('\u66b4', new String[] { "bao", "pu" }); //暴
            put('\u9642', new String[] { "bei", "pi", "po" }); //陂
            put('\u7b84', new String[] { "bei", "bi", "pi" }); //箄
            put('\u6911', new String[] { "bei", "pi" }); //椑
            put('\u5b5b', new String[] { "bei", "bo" }); //孛
            put('\u5457', new String[] { "bei", "bai" }); //呗
            put('\u681f', new String[] { "ben", "bing" }); //栟
            put('\u8d32', new String[] { "ben", "bi" }); //贲
            put('\u580b', new String[] { "beng", "peng" }); //堋
            put('\u5421', new String[] { "bi", "pi" }); //吡
            put('\u81c2', new String[] { "bi", "bei" }); //臂
            put('\u8f9f', new String[] { "bi", "pi" }); //辟
            put('\u88e8', new String[] { "bi", "pi" }); //裨
            put('\u90b2', new String[] { "bi", "bian" }); //邲
            put('\u69df', new String[] { "bin", "bing" }); //槟
            put('\u6241', new String[] { "bian", "pian" }); //扁
            put('\u4fbf', new String[] { "bian", "pian" }); //便
            put('\u7f0f', new String[] { "bian", "pian" }); //缏
            put('\u9aa0', new String[] { "biao", "piao" }); //骠
            put('\u6753', new String[] { "biao", "shao" }); //杓
            put('\u73a2', new String[] { "bin", "fen" }); //玢
            put('\u5c4f', new String[] { "bing", "ping" }); //屏
            put('\u5265', new String[] { "bo", "bao" }); //剥
            put('\u6cca', new String[] { "bo", "po" }); //泊
            put('\u4f2f', new String[] { "bo", "bai" }); //伯
            put('\u535c', new String[] { "bo", "bu" }); //卜
            put('\u57d4', new String[] { "bu", "pu" }); //埔
            put('\u5693', new String[] { "ca", "cha" }); //嚓
            put('\u53c2', new String[] { "can", "san", "shen", "cen" }); //参
            put('\u5072', new String[] { "cai", "si" }); //偲
            put('\u4fa7', new String[] { "ce", "zhai" }); //侧
            put('\u4f27', new String[] { "chang", "chen" }); //伧
            put('\u85cf', new String[] { "cang", "zang" }); //藏
            put('\u564c', new String[] { "ceng", "cheng" }); //噌
            put('\u66fe', new String[] { "ceng", "zeng" }); //曾
            put('\u9987', new String[] { "cha", "zha" }); //馇
            put('\u5dee', new String[] { "cha", "cha", "ci", "chai" }); //差
            put('\u55b3', new String[] { "cha", "zha" }); //喳
            put('\u67e5', new String[] { "cha", "zha" }); //查
            put('\u8336', new String[] { "cha", "zha" }); //茶
            put('\u837c', new String[] { "cha", "tu" }); //荼
            put('\u6942', new String[] { "cha", "zha" }); //楂
            put('\u63ba', new String[] { "chan", "can", "shan" }); //掺
            put('\u5b71', new String[] { "chan", "can" }); //孱
            put('\u7985', new String[] { "chan", "shan" }); //禅
            put('\u5574', new String[] { "chan", "tan" }); //啴
            put('\u98a4', new String[] { "chan", "zhan" }); //颤
            put('\u957f', new String[] { "chang", "zhang" }); //长
            put('\u5382', new String[] { "chang", "an" }); //厂
            put('\u739a', new String[] { "chang", "yang" }); //玚
            put('\u7625', new String[] { "chai", "cuo" }); //瘥
            put('\u712f', new String[] { "chao", "zhuo" }); //焯
            put('\u5632', new String[] { "chao", "zhao" }); //嘲
            put('\u671d', new String[] { "chao", "zhao" }); //朝
            put('\u8f66', new String[] { "che", "ju" }); //车
            put('\u8c0c', new String[] { "chen", "shen" }); //谌
            put('\u79f0', new String[] { "chen", "cheng", "cheng" }); //称
            put('\u94db', new String[] { "cheng", "dang" }); //铛
            put('\u4e58', new String[] { "cheng", "sheng" }); //乘
            put('\u6f84', new String[] { "cheng", "deng" }); //澄
            put('\u76db', new String[] { "cheng", "sheng" }); //盛
            put('\u5319', new String[] { "chi", "shi" }); //匙
            put('\u577b', new String[] { "chi", "di" }); //坻
            put('\u5c3a', new String[] { "chi", "che" }); //尺
            put('\u91cd', new String[] { "chong", "zhong" }); //重
            put('\u4ec7', new String[] { "chou", "qiu" }); //仇
            put('\u5e6c', new String[] { "chou", "dao" }); //幬
            put('\u677b', new String[] { "chou", "niu" }); //杻
            put('\u81ed', new String[] { "chou", "xiu" }); //臭
            put('\u755c', new String[] { "chu", "xu" }); //畜
            put('\u6b58', new String[] { "chua", "xu" }); //歘
            put('\u555c', new String[] { "chuai", "chuo" }); //啜
            put('\u4f20', new String[] { "chuan", "zhuan" }); //传
            put('\u931e', new String[] { "chun", "dui" }); //錞
            put('\u7ef0', new String[] { "chuo", "chao" }); //绰
            put('\u7ca2', new String[] { "ci", "zi" }); //粢
            put('\u8308', new String[] { "ci", "zi" }); //茈
            put('\u4f3a', new String[] { "ci", "si" }); //伺
            put('\u679e', new String[] { "cong", "zong" }); //枞
            put('\u6512', new String[] { "cuan", "zan" }); //攒
            put('\u64ae', new String[] { "cuo", "zuo" }); //撮
            put('\u9147', new String[] { "cuo", "zan" }); //酇
            put('\u55d2', new String[] { "da", "ta" }); //嗒
            put('\u5927', new String[] { "da", "dai" }); //大
            put('\u5454', new String[] { "dai", "tai" }); //呔
            put('\u8bd2', new String[] { "dai", "yi" }); //诒
            put('\u9a80', new String[] { "dai", "tai" }); //骀
            put('\u5355', new String[] { "dan", "chan", "shan" }); //单
            put('\u63b8', new String[] { "dan", "shan" }); //掸
            put('\u5f39', new String[] { "dan", "tan" }); //弹
            put('\u6fb9', new String[] { "dan", "tan" }); //澹
            put('\u53e8', new String[] { "dao", "dao", "tao" }); //叨
            put('\u5f97', new String[] { "de", "de", "dei" }); //得
            put('\u63d0', new String[] { "di", "ti" }); //提
            put('\u7684', new String[] { "di", "di", "de", "di" }); //的
            put('\u8e62', new String[] { "di", "zhi" }); //蹢
            put('\u5e95', new String[] { "di", "de" }); //底
            put('\u5730', new String[] { "di", "de" }); //地
            put('\u6755', new String[] { "di", "duo" }); //杕
            put('\u4f43', new String[] { "dian", "tian" }); //佃
            put('\u94bf', new String[] { "dian", "tian" }); //钿
            put('\u54a5', new String[] { "die", "xi" }); //咥
            put('\u558b', new String[] { "die", "zha" }); //喋
            put('\u87b2', new String[] { "die", "zhi" }); //螲
            put('\u4e01', new String[] { "ding", "zheng" }); //丁
            put('\u4f97', new String[] { "dong", "tong" }); //侗
            put('\u578c', new String[] { "dong", "tong" }); //垌
            put('\u5cd2', new String[] { "dong", "tong" }); //峒
            put('\u6d1e', new String[] { "dong", "tong" }); //洞
            put('\u606b', new String[] { "dong", "tong" }); //恫
            put('\u90fd', new String[] { "dou", "du" }); //都
            put('\u6793', new String[] { "dou", "zhu" }); //枓
            put('\u8bfb', new String[] { "du", "dou" }); //读
            put('\u5ea6', new String[] { "duo", "du" }); //度
            put('\u9566', new String[] { "dun", "dui" }); //镦
            put('\u6566', new String[] { "dun", "dui" }); //敦
            put('\u8e72', new String[] { "dun", "cun" }); //蹲
            put('\u56e4', new String[] { "dun", "tun" }); //囤
            put('\u6c8c', new String[] { "dun", "zhuan" }); //沌
            put('\u987f', new String[] { "dun", "du" }); //顿
            put('\u54c6', new String[] { "duo", "chi" }); //哆
            put('\u67c1', new String[] { "duo", "tuo" }); //柁
            put('\u6076', new String[] { "e", "wu", "wu" }); //恶
            put('\u54e6', new String[] { "e", "o", "o" }); //哦
            put('\u86fe', new String[] { "e", "yi" }); //蛾
            put('\u800f', new String[] { "er", "nai" }); //耏
            put('\u756a', new String[] { "fan", "pan" }); //番
            put('\u8543', new String[] { "fan", "fan", "bo" }); //蕃
            put('\u7e41', new String[] { "fan", "po" }); //繁
            put('\u82be', new String[] { "fei", "fu" }); //芾
            put('\u9022', new String[] { "feng", "pang", "peng" }); //逢
            put('\u51af', new String[] { "feng", "ping" }); //冯
            put('\u4f5b', new String[] { "fo", "fu" }); //佛
            put('\u5426', new String[] { "fou", "pi" }); //否
            put('\u62c2', new String[] { "fu", "bi" }); //拂
            put('\u80f3', new String[] { "ga", "ge", "ge" }); //胳
            put('\u80f2', new String[] { "gai", "hai" }); //胲
            put('\u76d6', new String[] { "gai", "ge" }); //盖
            put('\u9550', new String[] { "gao", "hao" }); //镐
            put('\u4ee1', new String[] { "ge", "yi" }); //仡
            put('\u7ea5', new String[] { "ge", "he" }); //纥
            put('\u9978', new String[] { "ge", "le" }); //饸
            put('\u54af', new String[] { "ge", "ka", "luo" }); //咯
            put('\u9769', new String[] { "ge", "ji" }); //革
            put('\u86e4', new String[] { "ge", "ha" }); //蛤
            put('\u5408', new String[] { "ge", "he" }); //合
            put('\u784c', new String[] { "ge", "luo" }); //硌
            put('\u7ed9', new String[] { "gei", "ji" }); //给
            put('\u9888', new String[] { "geng", "jing" }); //颈
            put('\u67b8', new String[] { "gou", "gou", "ju" }); //枸
            put('\u8c37', new String[] { "gu", "yu" }); //谷
            put('\u9e58', new String[] { "gu", "hu" }); //鹘
            put('\u5471', new String[] { "gua", "gu", "gua" }); //呱
            put('\u681d', new String[] { "gua", "kuo" }); //栝
            put('\u5e7f', new String[] { "guang", "an" }); //广
            put('\u5ec6', new String[] { "gui", "wei" }); //廆
            put('\u9c91', new String[] { "gui", "xie" }); //鲑
            put('\u6867', new String[] { "gui", "hui" }); //桧
            put('\u67dc', new String[] { "gui", "ju" }); //柜
            put('\u7085', new String[] { "gui", "jiong" }); //炅
            put('\u55e8', new String[] { "hai", "hei" }); //嗨
            put('\u8fd8', new String[] { "hai", "huan" }); //还
            put('\u592f', new String[] { "hang", "hen" }); //夯
            put('\u5df7', new String[] { "hang", "xiang" }); //巷
            put('\u542d', new String[] { "hang", "keng" }); //吭
            put('\u548c', new String[] { "he", "hu", "huo" }); //和
            put('\u8c89', new String[] { "he", "hao", "mo" }); //貉
            put('\u6838', new String[] { "he", "hu" }); //核
            put('\u8679', new String[] { "hong", "jiang" }); //虹
            put('\u7ea2', new String[] { "hong", "gong" }); //红
            put('\u9e44', new String[] { "hu", "gu" }); //鹄
            put('\u6d52', new String[] { "hu", "xu" }); //浒
            put('\u552c', new String[] { "hu", "xia" }); //唬
            put('\u54d7', new String[] { "hua", "huo" }); //哗
            put('\u90c7', new String[] { "huan", "xun" }); //郇
            put('\u57b8', new String[] { "huan", "yuan" }); //垸
            put('\u571c', new String[] { "huan", "yuan" }); //圜
            put('\u73f2', new String[] { "hui", "hun" }); //珲
            put('\u4f1a', new String[] { "hui", "kuai" }); //会
            put('\u8364', new String[] { "hun", "xun" }); //荤
            put('\u5947', new String[] { "ji", "qi" }); //奇
            put('\u7f09', new String[] { "ji", "qi" }); //缉
            put('\u4e9f', new String[] { "ji", "qi" }); //亟
            put('\u5048', new String[] { "ji", "jie" }); //偈
            put('\u7cfb', new String[] { "ji", "xi" }); //系
            put('\u8360', new String[] { "ji", "qi" }); //荠
            put('\u5bb6', new String[] { "jia", "jia", "jie" }); //家
            put('\u4f3d', new String[] { "jia", "ga", "qie" }); //伽
            put('\u8304', new String[] { "jia", "qie" }); //茄
            put('\u8d3e', new String[] { "jia", "gu" }); //贾
            put('\u89c1', new String[] { "jian", "xian" }); //见
            put('\u5c06', new String[] { "jiang", "jiang", "qiang" }); //将
            put('\u964d', new String[] { "jiang", "xiang" }); //降
            put('\u7f34', new String[] { "jiao", "zhuo" }); //缴
            put('\u6e6b', new String[] { "jiao", "qiu" }); //湫
            put('\u56bc', new String[] { "jiao", "jue", "jiao" }); //嚼
            put('\u4fa5', new String[] { "jiao", "yao" }); //侥
            put('\u89d2', new String[] { "jiao", "jue" }); //角
            put('\u811a', new String[] { "jiao", "jue" }); //脚
            put('\u527f', new String[] { "jiao", "chao" }); //剿
            put('\u6821', new String[] { "jiao", "xiao" }); //校
            put('\u89c9', new String[] { "jiao", "jue" }); //觉
            put('\u89e3', new String[] { "jie", "jie", "xie" }); //解
            put('\u82a5', new String[] { "jie", "gai" }); //芥
            put('\u85c9', new String[] { "jie", "ji" }); //藉
            put('\u77dc', new String[] { "jin", "qin", "guan" }); //矜
            put('\u52b2', new String[] { "jin", "jing" }); //劲
            put('\u9753', new String[] { "jing", "liang" }); //靓
            put('\u9f9f', new String[] { "jun", "gui", "qiu" }); //龟
            put('\u5480', new String[] { "ju", "zui" }); //咀
            put('\u53e5', new String[] { "ju", "gou" }); //句
            put('\u96bd', new String[] { "juan", "jun" }); //隽
            put('\u5671', new String[] { "jue", "xue" }); //噱
            put('\u6d5a', new String[] { "jun", "xun" }); //浚
            put('\u5496', new String[] { "ka", "ga" }); //咖
            put('\u5361', new String[] { "ka", "qia" }); //卡
            put('\u6977', new String[] { "kai", "jie" }); //楷
            put('\u69db', new String[] { "kan", "jian" }); //槛
            put('\u5d41', new String[] { "kan", "zhan" }); //嵁
            put('\u961a', new String[] { "kan", "han" }); //阚
            put('\u625b', new String[] { "kang", "gang" }); //扛
            put('\u58f3', new String[] { "ke", "qiao" }); //壳
            put('\u54b3', new String[] { "ke", "hai" }); //咳
            put('\u514b', new String[] { "ke", "kei" }); //克
            put('\u6d4d', new String[] { "kuai", "hui" }); //浍
            put('\u532e', new String[] { "kui", "gui" }); //匮
            put('\u814a', new String[] { "la", "xi" }); //腊
            put('\u8721', new String[] { "la", "zha" }); //蜡
            put('\u83a8', new String[] { "lang", "liang" }); //莨
            put('\u70d9', new String[] { "lao", "luo" }); //烙
            put('\u52d2', new String[] { "le", "lei" }); //勒
            put('\u808b', new String[] { "lei", "le" }); //肋
            put('\u68f1', new String[] { "leng", "leng", "ling" }); //棱
            put('\u680e', new String[] { "li", "yue" }); //栎
            put('\u9b32', new String[] { "li", "ge" }); //鬲
            put('\u8dde', new String[] { "li", "luo" }); //跞
            put('\u4fe9', new String[] { "lia", "liang" }); //俩
            put('\u6f66', new String[] { "liao", "lao" }); //潦
            put('\u4e86', new String[] { "liao", "le" }); //了
            put('\u84fc', new String[] { "liao", "lu" }); //蓼
            put('\u65bf', new String[] { "liu", "you" }); //斿
            put('\u788c', new String[] { "liu", "lu" }); //碌
            put('\u6cf7', new String[] { "long", "shuang" }); //泷
            put('\u507b', new String[] { "lou", "lv" }); //偻
            put('\u9732', new String[] { "lu", "lou" }); //露
            put('\u9646', new String[] { "lu", "liu" }); //陆
            put('\u634b', new String[] { "lv", "luo" }); //捋
            put('\u7eff', new String[] { "lv", "lu" }); //绿
            put('\u7387', new String[] { "lv", "shuai" }); //率
            put('\u7eb6', new String[] { "lun", "guan" }); //纶
            put('\u7edc', new String[] { "luo", "lao" }); //络
            put('\u843d', new String[] { "luo", "lao", "la" }); //落
            put('\u6f2f', new String[] { "luo", "ta" }); //漯
            put('\u8109', new String[] { "mo", "mai" }); //脉
            put('\u57cb', new String[] { "mai", "man" }); //埋
            put('\u8513', new String[] { "man", "wan", "man" }); //蔓
            put('\u6c13', new String[] { "mang", "meng" }); //氓
            put('\u5192', new String[] { "mao", "mo" }); //冒
            put('\u6ca1', new String[] { "mei", "mo" }); //没
            put('\u4eb9', new String[] { "men", "wei" }); //亹
            put('\u9e8b', new String[] { "mi", "mei" }); //麋
            put('\u79d8', new String[] { "mi", "bi" }); //秘
            put('\u6ccc', new String[] { "mi", "bi" }); //泌
            put('\u5b93', new String[] { "mi", "fu" }); //宓
            put('\u84c2', new String[] { "mi", "ming" }); //蓂
            put('\u6e11', new String[] { "mian", "sheng" }); //渑
            put('\u9efe', new String[] { "min", "mian" }); //黾
            put('\u6a21', new String[] { "mo", "mu" }); //模
            put('\u6469', new String[] { "mo", "ma" }); //摩
            put('\u62b9', new String[] { "mo", "mo", "ma" }); //抹
            put('\u7f2a', new String[] { "mou", "miu", "miao" }); //缪
            put('\u725f', new String[] { "mou", "mu" }); //牟
            put('\u90a3', new String[] { "na", "nei", "na", "nuo" }); //那
            put('\u5357', new String[] { "nan", "na" }); //南
            put('\u5462', new String[] { "ne", "ni" }); //呢
            put('\u9e1f', new String[] { "niao", "diao" }); //鸟
            put('\u5c3f', new String[] { "niao", "sui" }); //尿
            put('\u4e5c', new String[] { "nie", "mie" }); //乜
            put('\u5f04', new String[] { "nong", "long" }); //弄
            put('\u759f', new String[] { "nve", "yao" }); //疟
            put('\u5a1c', new String[] { "nuo", "na" }); //娜
            put('\u6eba', new String[] { "ni", "niao" }); //溺
            put('\u8feb', new String[] { "pai", "po" }); //迫
            put('\u80d6', new String[] { "pan", "pang" }); //胖
            put('\u5228', new String[] { "pao", "bao" }); //刨
            put('\u70ae', new String[] { "pao", "pao", "bao" }); //炮
            put('\u6ddc', new String[] { "peng", "ping" }); //淜
            put('\u9b44', new String[] { "po", "tuo" }); //魄
            put('\u812f', new String[] { "pu", "fu" }); //脯
            put('\u6734', new String[] { "pu", "po", "po", "piao" }); //朴
            put('\u7011', new String[] { "pu", "bao" }); //瀑
            put('\u66dd', new String[] { "pu", "bao" }); //曝
            put('\u6816', new String[] { "qi", "xi" }); //栖
            put('\u671f', new String[] { "qi", "ji" }); //期
            put('\u8e4a', new String[] { "qi", "xi" }); //蹊
            put('\u5176', new String[] { "qi", "ji" }); //其
            put('\u9a91', new String[] { "qi", "ji" }); //骑
            put('\u9f50', new String[] { "qi", "ji" }); //齐
            put('\u7a3d', new String[] { "qi", "ji" }); //稽
            put('\u7947', new String[] { "qi", "zhi" }); //祇
            put('\u5951', new String[] { "qi", "xie" }); //契
            put('\u780c', new String[] { "qi", "qie" }); //砌
            put('\u8368', new String[] { "qian", "xun" }); //荨
            put('\u6d45', new String[] { "qian", "jian" }); //浅
            put('\u831c', new String[] { "qian", "xi" }); //茜
            put('\u614a', new String[] { "qian", "qie" }); //慊
            put('\u5f3a', new String[] { "qiang", "qiang", "jiang" }); //强
            put('\u5ce4', new String[] { "qiao", "jiao" }); //峤
            put('\u9798', new String[] { "qiao", "shao" }); //鞘
            put('\u8d84', new String[] { "qie", "qie", "ju" }); //趄
            put('\u90c4', new String[] { "qie", "xi" }); //郄
            put('\u4eb2', new String[] { "qin", "qing" }); //亲
            put('\u6eb1', new String[] { "qin", "zhen" }); //溱
            put('\u7dae', new String[] { "qing", "qi" }); //綮
            put('\u533a', new String[] { "qu", "ou" }); //区
            put('\u5708', new String[] { "quan", "juan", "juan" }); //圈
            put('\u96c0', new String[] { "que", "qiao", "qiao" }); //雀
            put('\u82e5', new String[] { "ruo", "re" }); //若
            put('\u8272', new String[] { "se", "shai" }); //色
            put('\u585e', new String[] { "se", "sai", "sai" }); //塞
            put('\u6eb9', new String[] { "se", "suo" }); //溹
            put('\u4fdf', new String[] { "si", "qi" }); //俟
            put('\u772d', new String[] { "sui", "hui" }); //眭
            put('\u5239', new String[] { "sha", "cha", "cha" }); //刹
            put('\u53a6', new String[] { "sha", "xia" }); //厦
            put('\u6749', new String[] { "shan", "sha" }); //杉
            put('\u5261', new String[] { "shan", "yan" }); //剡
            put('\u82d5', new String[] { "shao", "tiao" }); //苕
            put('\u53ec', new String[] { "shao", "zhao" }); //召
            put('\u6298', new String[] { "she", "zhe", "zhe" }); //折
            put('\u5c04', new String[] { "she", "ye", "yi" }); //射
            put('\u8398', new String[] { "shen", "xin" }); //莘
            put('\u4ec0', new String[] { "shen", "shi" }); //什
            put('\u6c88', new String[] { "shen", "chen" }); //沈
            put('\u845a', new String[] { "shen", "ren" }); //葚
            put('\u8bc6', new String[] { "shi", "zhi" }); //识
            put('\u77f3', new String[] { "shi", "dan" }); //石
            put('\u62fe', new String[] { "shi", "she" }); //拾
            put('\u4f3c', new String[] { "shi", "si" }); //似
            put('\u87ab', new String[] { "shi", "zhe" }); //螫
            put('\u9002', new String[] { "shi", "kuo" }); //适
            put('\u719f', new String[] { "shu", "shou" }); //熟
            put('\u672f', new String[] { "shu", "shu", "zhu" }); //术
            put('\u4fde', new String[] { "shu", "yu" }); //俞
            put('\u8bf4', new String[] { "shui", "shuo" }); //说
            put('\u6570', new String[] { "shuo", "shu", "shu" }); //数
            put('\u838e', new String[] { "suo", "sha" }); //莎
            put('\u5fea', new String[] { "song", "zhong" }); //忪
            put('\u7f29', new String[] { "suo", "su" }); //缩
            put('\u6c93', new String[] { "ta", "da", "ta" }); //沓
            put('\u62d3', new String[] { "ta", "tuo" }); //拓
            put('\u8983', new String[] { "tan", "qin" }); //覃
            put('\u9561', new String[] { "tan", "xin" }); //镡
            put('\u7118', new String[] { "tao", "dao" }); //焘
            put('\u9676', new String[] { "tao", "yao" }); //陶
            put('\u6c64', new String[] { "tang", "shang" }); //汤
            put('\u5018', new String[] { "tang", "chang" }); //倘
            put('\u4ff6', new String[] { "ti", "chu" }); //俶
            put('\u8351', new String[] { "ti", "yi" }); //荑
            put('\u8c03', new String[] { "tiao", "diao" }); //调
            put('\u929a', new String[] { "tiao", "diao", "yao" }); //銚
            put('\u753a', new String[] { "ting", "ding" }); //町
            put('\u6883', new String[] { "ting", "ding" }); //梃
            put('\u5c6f', new String[] { "tun", "zhun" }); //屯
            put('\u9a6e', new String[] { "tuo", "duo" }); //驮
            put('\u5d34', new String[] { "wai", "wei" }); //崴
            put('\u839e', new String[] { "wan", "guan" }); //莞
            put('\u83c0', new String[] { "wan", "yu" }); //菀
            put('\u4e07', new String[] { "wan", "mo" }); //万
            put('\u5729', new String[] { "wei", "xu" }); //圩
            put('\u5c3e', new String[] { "wei", "yi" }); //尾
            put('\u9697', new String[] { "wei", "kui" }); //隗
            put('\u5c09', new String[] { "wei", "yu" }); //尉
            put('\u851a', new String[] { "wei", "yu" }); //蔚
            put('\u8f92', new String[] { "wen", "yun" }); //辒
            put('\u6c76', new String[] { "wen", "men" }); //汶
            put('\u6da1', new String[] { "wo", "guo" }); //涡
            put('\u90d7', new String[] { "xi", "chi" }); //郗
            put('\u94e3', new String[] { "xi", "xian" }); //铣
            put('\u620f', new String[] { "xi", "hu" }); //戏
            put('\u5413', new String[] { "xia", "he" }); //吓
            put('\u7ea4', new String[] { "xian", "qian" }); //纤
            put('\u6d17', new String[] { "xian", "xi" }); //洗
            put('\u9889', new String[] { "xie", "jie" }); //颉
            put('\u884c', new String[] { "xing", "hang", "hang", "heng" }); //行
            put('\u8365', new String[] { "xing", "ying" }); //荥
            put('\u7701', new String[] { "xing", "sheng" }); //省
            put('\u5bbf', new String[] { "xiu", "xiu", "su" }); //宿
            put('\u620c', new String[] { "xu", "gu" }); //戌
            put('\u524a', new String[] { "xue", "xiao" }); //削
            put('\u8840', new String[] { "xue", "xie" }); //血
            put('\u6bb7', new String[] { "yan", "yin", "yin" }); //殷
            put('\u54bd', new String[] { "yan", "yan", "ye" }); //咽
            put('\u6e6e', new String[] { "yan", "yin" }); //湮
            put('\u82ab', new String[] { "yan", "yuan" }); //芫
            put('\u94a5', new String[] { "yao", "yue" }); //钥
            put('\u53f6', new String[] { "ye", "xie" }); //叶
            put('\u7719', new String[] { "yi", "chi" }); //眙
            put('\u9057', new String[] { "yi", "wei" }); //遗
            put('\u65bc', new String[] { "yu", "wu", "yu" }); //於
            put('\u5581', new String[] { "yu", "yong" }); //喁
            put('\u71a8', new String[] { "yu", "yun" }); //熨
            put('\u80b2', new String[] { "yu", "yao" }); //育
            put('\u5401', new String[] { "yu", "yu", "xu" }); //吁
            put('\u5458', new String[] { "yuan", "yun", "yun" }); //员
            put('\u4e50', new String[] { "yue", "le", "yao" }); //乐
            put('\u7ea6', new String[] { "yue", "yao" }); //约
            put('\u7b60', new String[] { "yun", "jun" }); //筠
            put('\u51ff', new String[] { "zao", "zuo" }); //凿
            put('\u4ed4', new String[] { "zai", "zi", "zi" }); //仔
            put('\u62e9', new String[] { "ze", "zhai" }); //择
            put('\u7b2e', new String[] { "ze", "zuo" }); //笮
            put('\u5179', new String[] { "zi", "ci" }); //兹
            put('\u5958', new String[] { "zang", "zhuang" }); //奘
            put('\u624e', new String[] { "zha", "zha", "za" }); //扎
            put('\u8f67', new String[] { "zha", "ya" }); //轧
            put('\u781f', new String[] { "zha", "zuo" }); //砟
            put('\u7fdf', new String[] { "zhai", "di" }); //翟
            put('\u7c98', new String[] { "zhan", "nian" }); //粘
            put('\u5541', new String[] { "zhao", "zhou" }); //啁
            put('\u7740', new String[] { "zhao", "zhuo", "zhao" }); //着
            put('\u722a', new String[] { "zhao", "zhua" }); //爪
            put('\u5431', new String[] { "zhi", "zi" }); //吱
            put('\u6b96', new String[] { "zhi", "shi" }); //殖
            put('\u5cd9', new String[] { "zhi", "shi" }); //峙
            put('\u79cd', new String[] { "zhong", "chong", "zhong" }); //种
            put('\u5c5e', new String[] { "zhu", "shu" }); //属
            put('\u891a', new String[] { "zhu", "chu" }); //褚
            put('\u8457', new String[] { "zhu", "zhe", "zhuo" }); //著
            put('\u8d5a', new String[] { "zhuan", "zuan" }); //赚
            put('\u5e62', new String[] { "zhuang", "chuang" }); //幢
            put('\u690e', new String[] { "zhui", "chui" }); //椎
            put('\u7efc', new String[] { "zeng", "zong" }); //综
            put('\u5352', new String[] { "zu", "cu" }); //卒
            put('\u67de', new String[] { "zuo", "zha" }); //柞
            put('\u9162', new String[] { "zuo", "cu" }); //酢
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

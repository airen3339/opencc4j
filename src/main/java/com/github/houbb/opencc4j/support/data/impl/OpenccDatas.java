package com.github.houbb.opencc4j.support.data.impl;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.opencc4j.support.data.Data;

/**
 * 数据工具信息
 * @author binbin.hou
 * @since 0.1.5
 */
public final class OpenccDatas {

    /**
     * 私有化构造器
     * @since 0.1.5
     */
    private OpenccDatas(){}

    /**
     * 简体转繁体单字
     * @return 实现
     * @since 0.1.5
     */
    public static Data stChar() {
        return Instances.singleton(STCharData.class);
    }

    /**
     * 繁体转简体单字
     * @return 实现
     * @since 0.1.5
     */
    public static Data tsChar() {
        return Instances.singleton(TSCharData.class);
    }

    /**
     * 繁体转简体词组
     * @return 实现
     * @since 0.1.5
     */
    public static Data tsPhrase() {
        return Instances.singleton(TSPhraseData.class);
    }

    /**
     * 简体转繁体词组
     * @return 实现
     * @since 0.1.5
     */
    public static Data stPhrase() {
        return Instances.singleton(STPhraseData.class);
    }

    /**
     * 中国台湾简体转繁体单字
     * @return 实现
     * @since 1.7.0
     */
    public static Data twStChar() {
        return Instances.singleton(TwSTCharData.class);
    }

    /**
     * 中国台湾繁体转简体单字
     * @return 实现
     * @since 1.7.0
     */
    public static Data twTsChar() {
        return Instances.singleton(TwTSCharData.class);
    }

    /**
     * 中国台湾繁体转简体词组
     * @return 实现
     * @since 1.7.0
     */
    public static Data twTsPhrase() {
        return Instances.singleton(TwTSPhraseData.class);
    }

    /**
     * 中国台湾简体转繁体词组
     * @return 实现
     * @since 1.7.0
     */
    public static Data twStPhrase() {
        return Instances.singleton(TwSTPhraseData.class);
    }

}

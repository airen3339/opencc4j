package com.github.houbb.opencc4j.util;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.opencc4j.core.impl.ZhConvertBootstrap;
import com.github.houbb.opencc4j.support.segment.Segment;
import com.github.houbb.opencc4j.support.segment.impl.CharSegment;
import com.github.houbb.opencc4j.support.segment.impl.HuaBanSegment;

/**
 * 中文转换工具类
 * 1. 编码问题本工具类，默认支持的为 UTF-8 格式的字符串。如果格式不统一，自行处理
 * 2. 每次都 new 一个对象保证线程安全性
 * 3. 建议使用 {@link ZhConvertBootstrap} 来代替当前工具类。
 * @author bbhou
 * @version 1.0.0
 * @since 1.0.0, 2018/02/09
 */
public final class ZhConverterUtil {

    /**
     *  zh converter util
     * @since 1.0.0
     */    
    private ZhConverterUtil(){}

    /**
     * 转换为简体
     * 1. 默认使用花瓣分词
     * @param original 原始内容
     * @return 转换后的内容
     * @since 1.0.0
     */
    public static String convertToSimple(String original) {
        return convertToSimple(original, true);
    }

    /**
     * 转换为繁体
     * 1. 默认使用花瓣分词
     * @param original 原始内容
     * @return 转换后的内容
     * @since 1.0.0
     */
    public static String convertToTraditional(String original){
        return convertToTraditional(original, true);
    }

    /**
     * 转换为简体
     * @param original 原始内容
     * @param huabanSegment 是否花瓣分词
     * @return 转换后的内容
     * @since 1.0.0
     */
    public static String convertToSimple(String original, boolean huabanSegment) {
        Segment segment = getSegment(huabanSegment);
        final ZhConvertBootstrap zhConvertBootstrap = ZhConvertBootstrap.newInstance(segment);

        return zhConvertBootstrap.toSimple(original);
    }

    /**
     * 转换为繁体
     * @param original 原始内容
     * @param huabanSegment 是否花瓣分词
     * @return 转换后的内容
     * @since 1.0.0
     */
    public static String convertToTraditional(String original, boolean huabanSegment){
        Segment segment = getSegment(huabanSegment);
        final ZhConvertBootstrap zhConvertBootstrap = ZhConvertBootstrap.newInstance(segment);

        return zhConvertBootstrap.toTraditional(original);
    }

    /**
     * 获取分词器
     * @param huabanSegment 是否使用花瓣分词
     * @return 分词器
     * @since 1.0.0
     */
    private static Segment getSegment(boolean huabanSegment) {
        if(huabanSegment) {
            return Instances.singleton(HuaBanSegment.class);
        }
        return Instances.singleton(CharSegment.class);
    }

}

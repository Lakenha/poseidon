package org.laniakeamly.poseidon.framework.sql.xml;

import org.junit.Test;
import org.laniakeamly.poseidon.framework.sql.xml.build.PrecompiledClass;
import org.laniakeamly.poseidon.framework.sql.xml.build.ParserBuilderNode;

import java.util.List;

/**
 * 加载mapper
 * 解析、生成等方法都在这个调用并返回
 * Create by 2BKeyboard on 2019/12/17 18:14
 */
public class LoaderMapper {

    private ParserBuilderNode parserBuilderNode = new ParserBuilderNode();

    @Test
    public void simulation() throws Exception {
        List<PrecompiledClass> dynamicClasses = parserBuilderNode.readBuilderNode();
        System.out.println();
    }

}

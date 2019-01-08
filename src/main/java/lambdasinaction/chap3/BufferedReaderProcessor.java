package lambdasinaction.chap3;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author: qiudong
 * @description:
 * @date: Created in 10:13 2018-02-05
 */
@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader br) throws IOException;
}

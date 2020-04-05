package com.fsmflying.study.quickstart.n;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class IOTests {

    /**
     * 从键盘读取
     */
    @Test
    public void test_01_scanner() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
    }

    /**
     * 从键盘读取
     */
    @Test
    public void test_02_InputStream() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
    }



}

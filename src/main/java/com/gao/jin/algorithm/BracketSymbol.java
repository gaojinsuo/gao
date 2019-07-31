package com.gao.jin.algorithm;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author gaojinsuo
 * @Date: 2019/7/31 22:00
 */
public class BracketSymbol {

    public static boolean isVaild(String str){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(")","(");
        hashMap.put("]","[");
        Stack<String> stack = new Stack<>();

        for (int i = 0;i<str.length();i++) {
            if (stack.empty()) {
                stack.push(String.valueOf(str.charAt(i)));
            } else {
                if (stack.peek().equals(hashMap.get(String.valueOf(str.charAt(i))))) {
                    stack.pop();
                }else {
                    stack.push(String.valueOf(str.charAt(i)));
                }
            }
        }
        if (stack.empty()){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        System.out.println(isVaild("(([]))"));
    }
}

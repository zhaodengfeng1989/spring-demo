package com.zhaodf.api;

import com.zhaodf.beans.Person;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;
import java.util.Map;

/**
 * 类：SpELApi
 *
 * @author zhaodf
 * @date 2021/2/19
 */
public class SpELApi {
    public static void main(String[] args) {
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression exp = parser.parseExpression("'Hello World'");
//        String message = (String) exp.getValue();
//        System.out.println(message);
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        //内嵌list
        List numbers = (List) parser.parseExpression("{1,2,3,4}").getValue(context);
        System.out.println(numbers);
        List listOfLists = (List) parser.parseExpression("{{'a','b'},{'x','y'}}").getValue(context);
        System.out.println(listOfLists);

        //内嵌map
        Map inventorInfo = (Map) parser.parseExpression("{name:'Nikola',dob:'10-July-1856'}").getValue(context);
        System.out.println(inventorInfo);
        Map mapOfMaps = (Map) parser.parseExpression("{name:{first:'Nikola',last:'Tesla'},dob:{day:10,month:'July',year:1856}}").getValue(context);
        System.out.println(mapOfMaps);

        int[] numbers1 = (int[]) parser.parseExpression("new int[4]").getValue(context);
        System.out.println(numbers1.length);
        // Array with initializer
        int[] numbers2 = (int[]) parser.parseExpression("new int[]{1,2,3}").getValue(context);
        System.out.println(numbers);
        // Multi dimensional array
        int[][] numbers3 = (int[][]) parser.parseExpression("new int[4][5]").getValue(context);
        System.out.println(numbers3.length);

        // string literal, evaluates to "bc"
        String bc = parser.parseExpression("'abc'.substring(1, 3)").getValue(String.class);
        System.out.println(bc);

        // evaluates to true
        boolean trueValue = parser.parseExpression("2 == 2").getValue(Boolean.class);
        System.out.println(trueValue);

        // evaluates to false
        boolean falseValue = parser.parseExpression("2 < -5.0").getValue(Boolean.class);
        System.out.println(falseValue);

        Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);
        System.out.println(dateClass);

        Person person = new Person();
        context.setVariable("newName", "Mike Tesla");
        parser.parseExpression("name = #newName").getValue(context, person);
        System.out.println(person.getName());  // "Mike Tesla"
    }
}
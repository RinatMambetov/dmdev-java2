package com.rinat.lesson28.model;

import java.lang.reflect.*;

/**
 * Основные возможности Reflection API включают:
 * Загрузка классов: Позволяет загружать классы во время выполнения программы.
 * Создание объектов: Позволяет создавать экземпляры классов без использования оператора new.
 * Вызов методов: Позволяет вызывать методы объектов, даже если они являются приватными.
 * Доступ к полям: Позволяет читать и изменять значения полей объектов, даже если они являются приватными.
 * Изучение структуры классов: Позволяет получать информацию о классах, такую как имена методов, имена полей,
 * модификаторы доступа и т.д.
 */
public class ReflectionApiExample {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {
        User user = new User(3L, "Ivan", 23);
        Class<? extends User> userClass1 = user.getClass();
        Class<User> userClass2 = User.class;

        System.out.println(userClass1 == userClass2);
        System.out.println();
        System.out.println(userClass1.getName());
        System.out.println(userClass1.getSimpleName());
        System.out.println(userClass1.getCanonicalName());
        System.out.println();
        System.out.println(Test1.class.getName());
        System.out.println(Test1.class.getCanonicalName());
        System.out.println();
//        System.out.println(userClass2.getInterfaces());

//        testConstructor();
//        System.out.println();
        testFields(user);
        System.out.println();
        testMethods(user);

        System.out.println();
        System.out.println(User.class.getDeclaredField("age").getAnnotation(MinAge.class).age());
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "Petr");
        System.out.println(petr);
    }

    private static void testFields(Object object) throws IllegalAccessException {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(object);
//            declaredField.set();
            System.out.println(value);
            System.out.println(declaredField.getModifiers());
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
        }
    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Method method1 = user.getClass().getDeclaredMethod("getName");
        System.out.println(method1.invoke(user));

        Method method2 = user.getClass().getDeclaredMethod("setName", String.class);
        method2.invoke(user, "Sveta");
        System.out.println(user);
    }

    private class Test1 {
    }
}

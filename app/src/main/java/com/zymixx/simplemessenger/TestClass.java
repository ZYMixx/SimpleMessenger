package com.zymixx.simplemessenger;

import java.util.HashMap;

class TestClass {
    static int key = 0;
    static HashMap<Integer, String[]> hashMap;
    public void createMap(){
        key = 0;
        hashMap = null;
        hashMap = new HashMap();
        putInMap("Привет", "22:05", "1");
        putInMap("И тебе привет", "22:05", "0");
        putInMap("Дорогой, слушай у меня тут к тебе одной дело", "22:06", "1");
        putInMap("мм?\nчто-то не так? ты лучше сразу говори я всё стерплю", "22:07", "0");
        putInMap("Ты бы не могу больше не использовать мои фото в своих проектах", "22:09", "1");
        putInMap("Мне от этого правда как не по себе", "22:09", "1");
        putInMap("Правда? знаешь даже не думал об этомЕсли честно боюсь что не могу", "22:11", "0");
        putInMap("на тебе держится всё", "22:11", "0");
        putInMap("ты центр вселенной моих подписчиков", "22:11", "0");
        putInMap("терпи", "22:11", "0");
        putInMap("Нуууу попоочему почему почему!! найди себе другую королевну", "22:12", "1");
        putInMap("Точнее не другую", "22:12", "1");
        putInMap("нет не так, оставь меня у себя, и найди другую для других", "22:13", "1");
        putInMap("обещаю расмотреть твоё предложение", "22:14", "0");
        putInMap("а теперь иди спи", "22:14", "0");

    }

    public String[] makeList(String text, String data, String user){
        String s[] = {text, data, user};
        return s;
    }



    public void putInMap(String text, String data, String user){
        hashMap.put(key++, makeList(text, data, user));
    }
}

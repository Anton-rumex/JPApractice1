package com.work1.app1.webber;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class webService {

    static List<Menu> topics = new ArrayList<>( Arrays.asList(
            new Menu("spring","Spring Framework", "Spring Framework Description"),
                new Menu("java","Core Java", "Core Java Description"),
                new Menu("javascript","Javascript", "Javascript Description")

        ));
    public static List<Menu> getallTopics(){
        return topics;
    }
    public static Menu getMenu(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }

    public static void addtopic(Menu topic) {
        topics.add(topic);
    }


    public static void updatetopic(Menu topic, String id) {
        for (int i=0; i< topics.size(); i++){
            Menu m = topics.get(i);
            if (m.getId().equals(id)){
                topics.set(i,topic);
                return;
            }

        }
    }

    public static void deleteMenu(String id) {
        topics.removeIf(t -> t.getId().equals(id));

    }
}


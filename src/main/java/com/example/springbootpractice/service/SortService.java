package com.example.springbootpractice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.springbootpractice.logic.Sort;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        // 위 생성자로 주입받아서 코드가 필요없어짐.
        // Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}

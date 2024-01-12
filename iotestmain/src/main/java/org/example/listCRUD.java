package org.example;


import java.util.List;

public class listCRUD {
    // 添加元素

    public static <T> void add(List<T> list, T t) {
        list.add(t);
    }

    //删除元素

    public static<T> void remove(List<T> list,int key) {
        T entityToRemove = find(list,key);
        if (entityToRemove != null){
            list.remove(entityToRemove);

        }

    }

    //修改元素

    public static <T> boolean update(List<T> list,Integer key, T newEntity) {
        for (int i = 0; i < list.size(); i++) {
            T entity = list.get(i);
            if (entity.equals(key)) {
                list.set(i, newEntity);
                return true;
            }
        }
        return false;
    }


    // 查找元素

    public static <T> T find(List<T> list,Integer key) {
        for (T entity : list) {
            if (entity.hashCode()==key) {
                return entity;
            }
        }
        return null;
        //return list.indexOf(t);
    }

    //获取元素

    public static <T> T get(List<T> list, int index) {
        return list.get(index);
    }

    //获取集合长度

    public static <T> int size(List<T> list) {
        return list.size();
    }


    // 清空集合

    public static <T> void clear(List<T> list) {
        list.clear();
    }
}


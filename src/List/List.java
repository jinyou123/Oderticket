package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
集合的分类
1.list
特点：有序可重复
有序：先添加谁就先输出谁   下列输出结果（10     软件工程    88.8     10)
重复：代码中有两个10.都输出，

list.add(object e)
object e=1  向上转型
object o =1  装箱机制

2.set
特点：无序不可重复
下列set代码输出：
当前set集合的元素个数为3
集合内的元素a
集合内的元素河池学院
集合内的元素b

3.map
特点：无序不可重复  key-value
 */

public class List {

    //list
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("软件工程");
        list.add(88.8);
        list.add(10);
        System.out.println("当前list集合的元素个数为："+list.size());//4
        for(int i=0;i<list.size();i++){
            System.out.println("集合内的元素："+list.get(i)); //遍历，见list中的对象全部输出
        }
        System.out.println();



        //set
        Set<String>set=new HashSet();
        set.add("河池学院");
        //set.add(1);  会报错，只能输入String类型
        set.add("a");
        set.add("b");
        set.add("a");
        System.out.println("当前set集合的元素个数为："+set.size());

        Iterator iterator=set.iterator();
        while(iterator.hasNext()) {
            System.out.println("集合内的元素为："+iterator.next());
        }

    }
}

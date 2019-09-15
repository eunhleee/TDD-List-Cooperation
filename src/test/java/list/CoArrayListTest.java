package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CoArrayListTest {

    @Test
    public void testInit() {
        List<String> arraylist = new CoArrayList();

        assertThat(arraylist).isInstanceOf(List.class);
        assertThat(arraylist).isInstanceOf(CoArrayList.class);
    }

    @Test
    public void testAdd(){
        List<String> arraylist=new CoArrayList();
        arraylist.add("abcde");
        assertThat(arraylist.size()).isEqualTo(1);
    }
    @Test
    public void testAddAll(){
        List<String> arraylist=new CoArrayList();
        List<String> testlist=new ArrayList();
       for(int i=0;i<5;i++){
         arraylist.add(""+i);
         testlist.add(""+i);
        }
       assertThat(arraylist.size()).isEqualTo(5);
       assertThat(testlist.size()).isEqualTo(5);
       arraylist.addAll(testlist);
       assertThat(arraylist.size()).isEqualTo(10);
    }
    @Test
    public void testRemove(){
        List<String> arraylist=new CoArrayList();
        int arraySize=arraylist.size()-1;
        arraylist.remove(arraySize);
        assertThat(arraylist.size()).isEqualTo(arraySize-1);
    }
    @Test
    public void testRemoveAll(){
        List<String> arraylist=new CoArrayList();
        List<String> testlist=new ArrayList();
        arraylist.removeAll(testlist);
       assertThat(arraylist.size()).isEqualTo(0);
    }
    @Test
    public void testGet(){
        List<String> arraylist= new CoArrayList();
        for(int i=0;i<5;i++){
            arraylist.add(""+i);
        }
        assertThat(arraylist.get(4)).isEqualTo(4);
    }
    @Test
    public void testSet(){
        List<String> arraylist=new CoArrayList();
        arraylist.set(0,"abcde");
        assertThat(arraylist.get(0)).isEqualTo("abcde");
    }
    @Test
    public void testClear(){
        List<String> arraylist=new CoArrayList();
        arraylist.clear();
        assertThat(arraylist.size()).isEqualTo(0);
    }

    @Test
    public void testContains(){
        List<String> arraylist=new CoArrayList();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");
        arraylist.contains("a");
        assertThat(arraylist.size()).isEqualTo(2);
    }
    @Test
    public void testContainsAll(){
        List<String> arraylist=new CoArrayList();
        List<String> testlist=new ArrayList();
        for(int i=0;i<5;i++){
            arraylist.add(""+i);
            testlist.add(""+(i+1));
        }
        arraylist.containsAll(testlist);
        assertThat(arraylist.size()).isEqualTo(1);
    }
    @Test
    public void testRetainAll(){
        List<String> arraylist=new CoArrayList();
        List<String> testlist=new ArrayList();
        for(int i=0;i<5;i++){
            arraylist.add(""+i);
            testlist.add(""+(i+1));
        }
        arraylist.retainAll(testlist);
        assertThat(arraylist.size()).isEqualTo(1);
    }

    @Test
    public void testIndexOf(){
        List<String> arraylist=new CoArrayList();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");
       assertThat(arraylist.indexOf("b")).isEqualTo(1);
    }
    @Test
    public int testLastIndexOf(){
        List<String> arraylist=new CoArrayList();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");
        assertThat(arraylist.lastIndexOf("b")).isEqualTo(1);
    }
    @Test
    public void testIsEmpty(){
        List<String> arraylist=new CoArrayList();
        arraylist.add("a");
        assertThat(arraylist.isEmpty()).isEqualTo(1);
    }

    @Test
    public void testSubList(){
        List<String> arraylist=new CoArrayList();
        List<String> testlist=new ArrayList();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");
        arraylist.add("d");
        arraylist.add("e");
        arraylist.add("f");
        testlist.subList(1,3);
        assertThat(testlist.size()).isEqualTo(2);
    }

}
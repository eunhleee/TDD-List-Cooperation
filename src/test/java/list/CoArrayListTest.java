package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
}
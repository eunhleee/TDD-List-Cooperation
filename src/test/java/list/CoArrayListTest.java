package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CoArrayListTest {

    @Test
    public void testInit(){
       List<String> arraylist=new CoArrayList();
       List<String> testlist=new ArrayList<String>();


       assertThat(arraylist).isInstanceOf(List.class);
        assertThat(arraylist).isInstanceOf(CoArrayList.class);
    }
}
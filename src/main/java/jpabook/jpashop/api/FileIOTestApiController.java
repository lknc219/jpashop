package jpabook.jpashop.api;

import jpabook.jpashop.domain.FileIOTest;
import jpabook.jpashop.repository.FileIOTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class FileIOTestApiController {

    private final FileIOTestRepository fileIOTestRepository;

    @PostMapping("/api/v1/fileIOTest")
    public void FileIOTestApi(){
        try {
            File file = new File("C:\\Users\\KimNamChul\\Desktop\\김남철개인\\namchulTest\\src\\resources\\RISK-r-00000");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

//            String line = bufferedReader.readLine();
            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                FileIOTest fileIOTest = new FileIOTest();

                List<String> arr = Arrays.asList(line.split("\\|"));
                System.out.println("arr = " + arr);
                fileIOTest.setD01(arr.get(0));
                fileIOTest.setD02(arr.get(1));
                fileIOTest.setD03(arr.get(2));
                fileIOTest.setD04(arr.get(3));
                fileIOTest.setD05(arr.get(4));
                fileIOTest.setD06(arr.get(5));
                fileIOTest.setD07(arr.get(6));
                fileIOTest.setD08(arr.get(7));
                fileIOTest.setD09(arr.get(8));
                fileIOTest.setD10(arr.get(9));
                fileIOTest.setD11(arr.get(10));
                fileIOTest.setD12(arr.get(11));
                fileIOTest.setD13(arr.get(12));
                fileIOTest.setD14(arr.get(13));
                fileIOTest.setD15(arr.get(14));
                fileIOTest.setD16(arr.get(15));
                fileIOTest.setD17(arr.get(16));
                fileIOTest.setD18(arr.get(17));
                fileIOTest.setD19(arr.get(18));
                fileIOTest.setD20(arr.get(19));
                fileIOTest.setD21(arr.get(20));
                fileIOTest.setD22(arr.get(21));
                fileIOTest.setD23(arr.get(22));
                fileIOTest.setD24(arr.get(23));
                fileIOTest.setD25(arr.get(24));
                fileIOTest.setD26(arr.get(25));
                fileIOTest.setD27(arr.get(26));
                fileIOTest.setD28(arr.get(27));
                fileIOTest.setD29(arr.get(28));

                fileIOTestRepository.save(fileIOTest);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

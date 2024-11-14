package pzn.belajarvalidation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//annotation untuk validation method secara otomatis
//@Validated
//@Component
//public class SayHello {
//
//    public String sayHello(@NotBlank String name) {
//        return "Hello " + name;
//    }
//}

//mencoba method overriding, dimana kita mengimplementasikan dari method,
//tapi kita menambahkan @validated di kelas yang terimplemen, jika di test, maka
//akan error, karena ga bisa ada overriding kaya gitu.
//contoh overriding karena di ISayHello ngga ada validation, harusnya di
// class SayHello yang implemen, juga gabole, jalankan yang di tes, nanti error:
//@Validated -> tidak diperlukan lagi, karena sudah ditambahkan di ISayHello
@Component
public class SayHello implements ISayHello{

    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }
}

//sudah ditambahkan di IsayHello, maka tidak akan error, hapus @validated dan @NotBlank
//di ISayHello, dan uncomment @validated di kelas ini untuk melihat error

package org.gs;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import java.net.URL;
import java.util.List;
import static java.rmi.server.LogStream.log;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder(toBuilder = true)
public class Movie {

    @NonNull private Long id;
    @NonNull private String title;
    private String descripton;
    private String country;
    @NonNull private int rating;
    private URL officialSite;
    private String language;

    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)

    @Builder.Default
    private final int minutes = 120;

    @Singular("cast")
    private List<String> cast;

    int getMinutesPlus(@NonNull int x){
        return this.minutes + x;
    }

}

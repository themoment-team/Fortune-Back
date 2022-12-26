package fortune.be.fortunebackend.domain.fortune.dto;

import fortune.be.fortunebackend.domain.fortune.entity.FortuneData;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FortuneDataDto {
    private long Id;
    private String fortuneData;

    public FortuneData makeFortuneEntity(){
        return FortuneData.builder()
                .id(this.Id)
                .fortuneData(this.fortuneData)
                .build();
    }
    public FortuneDataDto randomFortune(){
        return null;
    }
}
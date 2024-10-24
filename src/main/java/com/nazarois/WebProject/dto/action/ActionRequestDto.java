package com.nazarois.WebProject.dto.action;

import static com.nazarois.WebProject.constants.AppConstants.IMAGE_RESPONSE_FORMAT;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.nazarois.WebProject.annotation.ValidSize;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ActionRequestDto {
  @NotBlank
  @Length(max = 30)
  private String title;

  @NotBlank private String prompt;

  @ValidSize private String size;

  @Min(1)
  @Max(10)
  private int numImages;
}

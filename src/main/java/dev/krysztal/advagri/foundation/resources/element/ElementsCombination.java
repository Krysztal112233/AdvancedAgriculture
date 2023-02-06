package dev.krysztal.advagri.foundation.resources.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class ElementsCombination {

  @Getter
  private int nitrogen = 0;

  @Getter
  private int phosphorus = 0;

  @Getter
  private int potassium = 0;
}

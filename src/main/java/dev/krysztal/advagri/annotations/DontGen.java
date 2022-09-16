package dev.krysztal.advagri.annotations;

import java.lang.annotation.*;

/**
 * For data generator
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DontGen {
}

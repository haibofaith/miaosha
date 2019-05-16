package xyz.haibofaith.miaosha.validator;

import org.springframework.util.StringUtils;
import xyz.haibofaith.miaosha.util.ValidatorUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

/**
 * @author:haibo.xiong
 * @date:2019/5/16
 * @description:
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile,String>{
    private boolean required = false;
    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (required){
            //必须
            return ValidatorUtil.isMobile(s);
        }else {
            //非必须
            if (StringUtils.isEmpty(s)){
                return true;
            }else {
                return ValidatorUtil.isMobile(s);
            }
        }
    }
}

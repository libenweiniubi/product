//package com.calb.es.utils.bean;
//
//
//import javax.xml.validation.Validator;
//
///**
// * bean对象属性验证
// *
// * @author ruoyi
// */
//public class BeanValidators
//{
//    public static void validateWithException(Validator validator, Object object, Class<?>... groups)
//            throws ConstraintViolationException
//    {
//        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
//        if (!constraintViolations.isEmpty())
//        {
//            throw new ConstraintViolationException(constraintViolations);
//        }
//    }
//}

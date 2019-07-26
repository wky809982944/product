package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/26 09:16
 * @Description:
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}

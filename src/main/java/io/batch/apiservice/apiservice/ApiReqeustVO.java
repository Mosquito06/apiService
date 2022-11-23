package io.batch.apiservice.apiservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiReqeustVO
{
    private long id;
    private ProductVO productVO;
}

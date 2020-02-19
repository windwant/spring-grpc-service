package org.windwant.grpc.common.api;

import org.windwant.grpc.proto.Common;

/**
 * client interface
 */
public interface IXXXService {

    Common.CommonResponse hello(String name);

}

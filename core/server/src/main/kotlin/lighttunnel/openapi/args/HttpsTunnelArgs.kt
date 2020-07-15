package lighttunnel.openapi.args

import io.netty.handler.ssl.SslContext
import lighttunnel.base.util.SslContextUtil
import lighttunnel.openapi.http.HttpPlugin
import lighttunnel.openapi.http.HttpTunnelRequestInterceptor

class HttpsTunnelArgs(
    val bindAddr: String? = null,
    val bindPort: Int? = null,
    val httpTunnelRequestInterceptor: HttpTunnelRequestInterceptor = HttpTunnelRequestInterceptor.emptyImpl,
    val httpPlugin: HttpPlugin? = null,
    val sslContext: SslContext = SslContextUtil.forBuiltinServer()
)
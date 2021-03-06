@file:Suppress("unused")

package lighttunnel.internal.server.tcp

import io.netty.channel.Channel
import lighttunnel.internal.server.util.SessionChannels
import lighttunnel.tcp.TcpFd

internal class TcpFdDefaultImpl(
    val sessionChannels: SessionChannels,
    private val closeFuture: () -> Unit
) : TcpFd {

    override val tunnelRequest get() = sessionChannels.tunnelRequest
    override val connectionCount get() = sessionChannels.cachedChannelCount
    override val trafficStats get() = sessionChannels.trafficStatsDefaultImpl

    val tunnelId get() = sessionChannels.tunnelId
    val port get() = tunnelRequest.remotePort
    val tunnelChannel get() = sessionChannels.tunnelChannel

    fun close() {
        closeFuture()
        sessionChannels.depose()
    }

    fun forceOff() = sessionChannels.forceOff()

    fun putChannel(channel: Channel) = sessionChannels.putChannel(channel)

    fun removeChannel(sessionId: Long) = sessionChannels.removeChannel(sessionId)

    override fun toString(): String = tunnelRequest.toString()

}
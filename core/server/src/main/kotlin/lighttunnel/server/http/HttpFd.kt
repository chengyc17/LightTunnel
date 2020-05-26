package lighttunnel.server.http

import io.netty.channel.Channel
import lighttunnel.server.util.SessionChannels
import java.util.*

class HttpFd internal constructor(
    val host: String,
    private val sessionChannels: SessionChannels,
    val createAt: Date = Date()
) {

    val tunnelId get() = sessionChannels.tunnelId

    val tunnelRequest get() = sessionChannels.tunnelRequest

    val cachedChannelCount get() = sessionChannels.cachedChannelCount

    override fun toString(): String = tunnelRequest.toString()

    internal val tunnelChannel get() = sessionChannels.tunnelChannel

    internal fun close() = sessionChannels.depose()

    internal fun forcedOffline() = sessionChannels.forcedOffline()

    internal fun putChannel(channel: Channel) = sessionChannels.putChannel(channel)


}

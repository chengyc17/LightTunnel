package lighttunnel.util

import java.util.*

interface Statistics {
    val createAt: Date
    val updateAt: Date
    val inboundBytes: Long
    val outboundBytes: Long
}
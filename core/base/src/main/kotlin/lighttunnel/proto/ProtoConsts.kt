package lighttunnel.proto


internal object ProtoConsts {
    /** 空字节数组 */
    val emptyBytes = ByteArray(0)
    /** 消息帧域长度 */
    const val TP_MESSAGE_LENGTH_FIELD_LENGTH = 4
    /** 命令长度 */
    const val TP_MESSAGE_COMMAND_LENGTH = 1
    /** head 长度域长度 */
    const val TP_MESSAGE_HEAD_LENGTH_FIELD_LENGTH = 4
}

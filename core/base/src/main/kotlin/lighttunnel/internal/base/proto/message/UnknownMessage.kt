package lighttunnel.internal.base.proto.message

import lighttunnel.internal.base.proto.ProtoMessage
import lighttunnel.internal.base.proto.ProtoMessageType
import lighttunnel.internal.base.proto.emptyBytes

class UnknownMessage : ProtoMessage(ProtoMessageType.FORCE_OFF, emptyBytes, emptyBytes)
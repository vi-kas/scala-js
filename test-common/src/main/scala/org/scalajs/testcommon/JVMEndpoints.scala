package org.scalajs.testcommon

import sbt.testing.Event

private[scalajs] object JVMEndpoints {
  val msgSlave: MsgEndpoint.EP[RunMux[String]] = MsgEndpoint[RunMux[String]](2)

  val msgMaster: MsgEndpoint.EP[RunMux[FrameworkMessage]] =
    MsgEndpoint[RunMux[FrameworkMessage]](3)

  val event: MsgEndpoint.EP[RunMux[Event]] = MsgEndpoint[RunMux[Event]](4)

  val logError: MsgEndpoint.EP[RunMux[LogElement[String]]] =
    MsgEndpoint[RunMux[LogElement[String]]](5)

  val logWarn: MsgEndpoint.EP[RunMux[LogElement[String]]] =
    MsgEndpoint[RunMux[LogElement[String]]](6)

  val logInfo: MsgEndpoint.EP[RunMux[LogElement[String]]] =
    MsgEndpoint[RunMux[LogElement[String]]](7)

  val logDebug: MsgEndpoint.EP[RunMux[LogElement[String]]] =
    MsgEndpoint[RunMux[LogElement[String]]](8)

  val logTrace: MsgEndpoint.EP[RunMux[LogElement[Throwable]]] =
    MsgEndpoint[RunMux[LogElement[Throwable]]](9)
}

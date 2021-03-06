package nxt_action_msgs;

public interface ArmPositionActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "nxt_action_msgs/ArmPositionActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nArmPositionResult result\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  nxt_action_msgs.ArmPositionResult getResult();
  void setResult(nxt_action_msgs.ArmPositionResult value);
}

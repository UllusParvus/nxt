package nxt_action_msgs;

public interface ArmPositionFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "nxt_action_msgs/ArmPositionFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\n# feedback (current positions in rad)\nstring[] joint_names_feedback\nfloat32[] joint_position_angles_feedback\n\n";
  java.util.List<java.lang.String> getJointNamesFeedback();
  void setJointNamesFeedback(java.util.List<java.lang.String> value);
  float[] getJointPositionAnglesFeedback();
  void setJointPositionAnglesFeedback(float[] value);
}

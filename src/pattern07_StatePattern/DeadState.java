package pattern07_StatePattern;

public class DeadState extends ThreadState {
	public DeadState() {
		state = StateSet.DEAD;
		System.out.println("线程死亡");
	}
	
	public void resume(ThreadContext tc) {
		System.out.println("调用了Start方法");
		if(state == StateSet.NEW)
			tc.setThreadState(new RunnableState());
		else
			System.out.println("当前线程不是新建状态");
	}
}

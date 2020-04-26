package pattern09_IteratorPattern;

public class TCLTelevision implements Television {
	private Object[] obj = {"湖南卫视", "北京卫视","东方卫视","浙江卫视","湖北卫视"};
	@Override
	public TVIterator createIterator() {
		return new TCLIterator();
	}
	
	private class TCLIterator implements TVIterator{
		private int currentIndex = 0;
		
		public void setChannel(int i) {
			currentIndex = i;
		}
		
		public void next() {
			if(currentIndex < obj.length) {
				currentIndex++;
			}
		}
		
		public void previous() {
			if(currentIndex > 0) {
				currentIndex--;
			}
		}
		
		public Object currentChannel() {
			return obj[currentIndex];
		}
		
		public boolean isLast() {
			return currentIndex == obj.length-1;
		}
		
		public boolean isFirst() {
			return currentIndex == 0;
		}

		
	}
}

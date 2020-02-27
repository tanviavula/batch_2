package com.nubes.cj.basics.day37;

public class ArrayOperations {

		public boolean isSubset(int big[],int small[]) {
			if(small.length > big.length) {
				return false;
			}else {
				for(int ele:small) {
					boolean flag = isPresent(big, ele);
					if(!flag)
						return false;
				}
			}
			return true;
		}

		private boolean isPresent(int[] big, int ele) {
			for(int e:big) {
				if(e == ele)
					return true;
			}
			return false;
		}
}

package �����÷��̾�;

public class Music {
	
	//���� ���� �ϳ��� ����
	
	//1. �ʵ� �Ӽ� - ����, ����, ���
	private String singer;
	private String title;
	private String path;
	
	//2. �޼ҵ� ��� 
	
	//�ʵ� ������ �ʱ�ȭ�ϴ� ������
	
	public Music(String singer, String title, String path) {
		this.singer = singer;
		this.title = title;
		this.path = path;
	}

	//��� �ʵ�� ���� ���� getter�޼ҵ�
	
	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public String getPath() {
		return path;
	}	
	
	


}

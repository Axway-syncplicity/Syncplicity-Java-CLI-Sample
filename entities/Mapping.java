package entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Mapping implements Serializable {
	public long SyncPointId;

	public String Path;

	public boolean Mapped;

	public boolean DownloadEnabled;

	public boolean UploadEnabled;
}